package com.example.sample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LogAspect {

    /**
     * サービスの実行前にログを出力する .
     * 対象: [UserService]をクラス名に含んでいる
     */
    @Before("execution(* *..*.*UserService.*(..))")
    public void startLog(JoinPoint jp) {
        log.info("メソッド開始:" + jp.getSignature());
    }

    /**
     * サービスの実行後にログを出力する .
     * 対象: [UserService]をクラス名に含んでいる
     */
    @After("execution(* *..*.*UserService.*(..))")
    public void endLog(JoinPoint jp) {
        log.info("メソッド終了:" + jp.getSignature());
    }

    /**
     * コントローラーの実行前後にログを出力する
     */
    @Around("@Within(org.springframework.stereotype.Controller)")
    public Object startLog(ProceedingJoinPoint jp) throws Throwable {
        log.info("メソッド開始:" + jp.getSignature());
        try {
            Object result = jp.proceed();
            log.info("メソッド終了:" + jp.getSignature());
            return result;
        } catch (Exception e) {
            log.error("メソッド異常終了:" + jp.getSignature()); 
            throw e;
        }
    }
}
