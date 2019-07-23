package com.fzx.study.springbootrw.bean;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/22  9:43
 **/
public class DBContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();
    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void set(DatabaseType dbType) {
        contextHolder.set(dbType);
    }

    public static DatabaseType get() {
        return contextHolder.get();
    }

    public static void master() {
        set(DatabaseType.master);
        System.out.println(contextHolder.get());
        System.out.println("切换到master");
    }

    public static void slave() {
        //  轮询
//        int index = counter.getAndIncrement() % 2;
//        if (counter.get() > 9999) {
//            counter.set(-1);
//        }
//        if (index == 0) {
            set(DatabaseType.slave1);
            System.out.println(contextHolder.get()+"-----------------");
            System.out.println("切换到slave1");
//        }else {
//            set(DBTypeEnum.SLAVE2);
//            System.out.println("切换到slave2");
//        }
    }
}
