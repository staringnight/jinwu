package com.pokeya.jinwu.infrastructure.job.schedule;

import com.pokeya.jinwu.service.job.*;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * XxlJob开发示例（Bean模式）
 * <p>
 * 开发步骤：
 * 1、任务开发：在Spring Bean实例中，开发Job方法；
 * 2、注解配置：为Job方法添加注解 "@XxlJob(value="自定义jobhandler名称", init = "JobHandler初始化方法", destroy = "JobHandler销毁方法")"，注解value值对应的是调度中心新建任务的JobHandler属性的值。
 * 3、执行日志：需要通过 "XxlJobHelper.log" 打印执行日志；
 * 4、任务结果：默认任务结果为 "成功" 状态，不需要主动设置；如有诉求，比如设置任务结果为失败，可以通过 "XxlJobHelper.handleFail/handleSuccess" 自主设置任务结果；
 *
 * @author xuxueli 2019-12-11 21:52:51
 */
@Slf4j
@Component
public class SampleXxlJob {

    private DemoHandler demoHandler;
    private ShardingHandler shardingHandler;
    private CommandHandler commandHandler;
    private HttpHandler httpHandler;
    private LifecycleHandler lifecycleHandler;

    @Autowired
    public SampleXxlJob(DemoHandler demoHandler, ShardingHandler shardingHandler, CommandHandler commandHandler, HttpHandler httpHandler, LifecycleHandler lifecycleHandler) {
        this.demoHandler = demoHandler;
        this.shardingHandler = shardingHandler;
        this.commandHandler = commandHandler;
        this.httpHandler = httpHandler;
        this.lifecycleHandler = lifecycleHandler;
    }

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler")
    public void demoJobHandler() {
        XxlJobHelper.log("XXL-JOB, Hello World.");
        demoHandler.handle();
        XxlJobHelper.log("demoJobHandler,处理结束");
        // default success
    }


    /**
     * 2、分片广播任务
     */
    @XxlJob("shardingJobHandler")
    public void shardingJobHandler() {

        // 分片参数
        int shardIndex = XxlJobHelper.getShardIndex();
        int shardTotal = XxlJobHelper.getShardTotal();

        XxlJobHelper.log("分片参数：当前分片序号 = {}, 总分片数 = {}", shardIndex, shardTotal);

        // 业务逻辑
        for (int i = 0; i < shardTotal; i++) {
            if (i == shardIndex) {
                XxlJobHelper.log("第 {} 片, 命中分片开始处理", i);
                shardingHandler.handle();
            } else {
                XxlJobHelper.log("第 {} 片, 忽略", i);
            }
        }

    }


    /**
     * 3、命令行任务
     */
    @XxlJob("commandJobHandler")
    public void commandJobHandler() {
        String command = XxlJobHelper.getJobParam();
        if (!StringUtils.hasLength(command)) {
            XxlJobHelper.log("command invalid.");

            XxlJobHelper.handleFail();
            return;
        }
        int exitValue = -1;
        try {
            exitValue = commandHandler.execute(command);
        } catch (Exception e) {
            XxlJobHelper.log(e);
        }

        if (exitValue != 0) {
            XxlJobHelper.handleFail("command exit value(" + exitValue + ") is failed");
        }

    }


    /**
     * 4、跨平台Http任务
     * 参数示例：
     * "http://www.baidu.com"
     */
    @XxlJob("httpJobHandler")
    public void httpJobHandler() throws Exception {

        // param parse
        String param = XxlJobHelper.getJobParam();
        if (StringUtils.hasLength(param)) {
            XxlJobHelper.log("param invalid.");
            XxlJobHelper.handleFail();
            return;
        }

        try {
            String responseMsg = httpHandler.request(param);
            XxlJobHelper.log(responseMsg);
        } catch (Exception e) {
            XxlJobHelper.log(e);
            XxlJobHelper.handleFail();
        }
    }

    /**
     * 5、生命周期任务示例：任务初始化与销毁时，支持自定义相关逻辑；
     */
    @XxlJob(value = "cycleJobHandler2", init = "init", destroy = "destroy")
    public void cycleJobHandler2() throws Exception {
        lifecycleHandler.handler();
    }

    public void init() {
        lifecycleHandler.init();
    }

    public void destroy() {
        lifecycleHandler.destroy();
    }


}
