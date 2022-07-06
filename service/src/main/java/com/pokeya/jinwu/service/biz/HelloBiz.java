package com.pokeya.jinwu.service.biz;

import com.pokeya.jinwu.api.HelloApi;
import com.pokeya.jinwu.api.dto.StudentDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author: huangjl
 * @date: 2022/4/14
 */
@DubboService
@Slf4j
@RefreshScope
public class HelloBiz implements HelloApi {

//    @Autowired
//    private RedissonClient redissonClient;
//
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;

    @Value("${hello.test}")
    private String helloTest;

    @Override
    public void sayHello(StudentDto studentDto) {
//        RLock lock = redissonClient.getLock("teacher_test_lock");
//        try {
//            boolean lockSuccess = lock.tryLock(3, 10, TimeUnit.SECONDS);
//            System.out.println("测试redisson配置文件读取加锁是否成功:" + lockSuccess);
//            if (lockSuccess) {
//                ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
//                valueOperations.set("teacher_test_str", "1");
//                valueOperations.increment("teacher_test_str", 2);
//                redisTemplate.expire("teacher_test_str", 1, TimeUnit.MINUTES);
//
//
//                System.out.println("valueOperations String : " + valueOperations.get("teacher_test_str"));
//
//                HashOperations<String, String, Object> opsForHash = redisTemplate.opsForHash();
//                UserInfo userInfo = new UserInfo();
//                userInfo.setUserId("123qqq");
//                userInfo.setName("zhangsan");
//
//                opsForHash.put("teacher_test_hash", "user", userInfo);
//                redisTemplate.expire("teacher_test_hash", 1, TimeUnit.MINUTES);
//
//                System.out.println("opsForHash hash : " + opsForHash.get("teacher_test_hash", "user"));
//
//
//                SetOperations<String, Object> opsForSet = redisTemplate.opsForSet();
//                opsForSet.add("teacher_test_set", "teacher_test_set");
//                redisTemplate.expire("teacher_test_set", 1, TimeUnit.MINUTES);
//
//
//                System.out.println("helloTest : " + helloTest);
//            } else {
//                log.info("排队中...");
//            }
//        } catch (Exception e) {
//            log.error("【HelloServiceImpl#sayHello】error: {}", e);
//        } finally {
//            if (lock.isLocked()) {
//                lock.unlock();
//            }
//        }
    }
}
