package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyDemoJobHandler {
    private static Logger logger = LoggerFactory.getLogger(SampleXxlJob.class);

    @XxlJob(value = "myDemoJobHandler")
    public void myDemoJobHandler() throws InterruptedException {
        String param = XxlJobHelper.getJobParam();
        Thread.sleep(5 * 1000);
        for (int i = 0; i < 100; i++) {
            logger.info("myDemoJobHandler is runing, time={}, param={}", i, param);
        }
    }
}
