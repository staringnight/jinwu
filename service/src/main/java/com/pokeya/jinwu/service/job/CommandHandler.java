package com.pokeya.jinwu.service.job;

import com.pokeya.jinwu.service.acl.JobLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author chentong
 * @Date 2022/7/6 8:11 PM
 */
@Component
public class CommandHandler {
    private JobLogger jobLogger;

    public CommandHandler(@Autowired JobLogger jobLogger) {
        this.jobLogger = jobLogger;
    }

    public int execute(String command) {
        int exitValue = -1;
        // command process
        Process process = null;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command(command);
            processBuilder.redirectErrorStream(true);

            process = processBuilder.start();
            //Process process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            jobLogger.log(e);
        }


        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(process.getInputStream());
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream))) {

            // command log
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jobLogger.log(line);
            }

            // command exit
            process.waitFor();
            exitValue = process.exitValue();
        } catch (Exception e) {
            jobLogger.log(e);
        }
        return exitValue;
    }
}
