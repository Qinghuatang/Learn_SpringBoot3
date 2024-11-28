package com.qinghua.springboot.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 记录日志的工具
    public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // 定义切入点，匹配所有以"service"结尾包下的所有方法
    // 切入点表达式
    @Pointcut("execution(* com.qinghua.springboot.service.*.*(..))")
    public void serviceMethods() {
    }

    // 在切入点之前执行此方法
    // 前置通知
    @Before("serviceMethods()")
    public void logBefore(JoinPoint joinPoint){
        logger.info("调用方法：{} 参数：{}", joinPoint.getSignature().getName(), joinPoint.getArgs());
    }
}
