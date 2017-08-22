package com.chenlong.service.web;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chenlong on 2017/8/3.
 */
@RestController
public class TestMDCController {

    Logger logger = LogManager.getLogger(getClass());

//    ExecutorService executorService = Executors.newFixedThreadPool(1);


    @RequestMapping("/getTxid")
    public Object getTransctionId(HttpServletRequest request) throws ExecutionException, InterruptedException {

        Object txId = MDC.get("PtxId");
        logger.info("1.获取txId:"+txId);

//        executorService.submit(() -> {
//            Logger logger1 = LogManager.getLogger(getClass());
//
//            Object txId1 = MDC.get("PtxId");
//            logger1.info("-----logger 1 thread 获取txId:" + txId1);
//            logger.info("+++logger 获取txId:{}" + txId1);
//            logger.info("PtxId:" + ThreadContext.get("PtxId"));
//
//        }).get();

        //executorService.shutdown();
        logger.info("2.获取txId:"+txId);


        return  txId;
    }
}

