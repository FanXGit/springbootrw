package com.fzx.study.springbootrw.config;

import com.fzx.study.springbootrw.bean.DBContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/22  9:47
 **/
@Aspect
@Component
public class DataSourceAop {
    @Pointcut("!@annotation(com.fzx.study.springbootrw.annotation.Master) " +
            "&& (execution(* com.fzx.study.springbootrw.service..*.select*(..)) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.get*(..)))")
    public void  readPointcut() {

    }

    @Pointcut("@annotation(com.fzx.study.springbootrw.annotation.Master) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.insert*(..)) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.add*(..)) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.update*(..)) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.edit*(..)) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.delete*(..)) " +
            "|| execution(* com.fzx.study.springbootrw.service..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }


}
