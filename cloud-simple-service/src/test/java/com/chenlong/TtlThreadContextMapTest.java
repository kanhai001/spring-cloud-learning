package com.chenlong;

import com.alibaba.ttl.TtlRunnable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chenlong on 2017/8/3.
 */
public class TtlThreadContextMapTest {

    static Logger logger = LogManager.getLogger(TtlThreadContextMapTest.class);
    final ExecutorService executorService = Executors.newFixedThreadPool(1);


    @Test
    public void testName() throws Exception {
        // Log in Main Thread
        logger.info("Log in main!");


        // Run task in thread pool
        executorService.submit(createTask()).get();

        // Init Log Context, set TTL
        // More KV if needed
        final String TRACE_ID = "trace-id";
        final String TRACE_ID_VALUE = "XXX-YYY-ZZZ";
        ThreadContext.put(TRACE_ID, TRACE_ID_VALUE);

        // Log in Main Thread
        logger.info("Log in main!");
        for (int i=0 ;i<3;i++)
            executorService.submit(createTask()).get();

        logger.info("Exit main");
        executorService.shutdown();
    }

    Runnable createTask() {
        final Runnable task = new Runnable() {
            @Override
            public void run() {
                // Log in thread pool
                ThreadContext.put("task", "" + System.currentTimeMillis());
                logger.info("trace-id:"+ ThreadContext.get("trace-id"));
                logger.info("Log in Runnable!");
            }
        };
        return TtlRunnable.get(task);
    }
}
