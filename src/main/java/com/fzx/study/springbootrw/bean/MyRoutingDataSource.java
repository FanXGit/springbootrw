package com.fzx.study.springbootrw.bean;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/22  9:42
 **/
public class MyRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.get();
    }
}
