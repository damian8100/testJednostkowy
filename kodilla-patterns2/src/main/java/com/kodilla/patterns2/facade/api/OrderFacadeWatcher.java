package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.facade.api.OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order,userId) && target(object)")
    public void logEvent(OrderDto order,Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + order + userId);
    }
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();                  // [1]
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();                    // [2]
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");   // [3]
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());               // [4]
            throw throwable;
        }
        return result;
    }
}