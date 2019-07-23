package com.fzx.study.springbootrw.config;

import com.fzx.study.springbootrw.bean.DatabaseType;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import javax.sql.DataSource;
import java.util.Random;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/19  16:02
 **/
//public class DynamicDataSource extends AbstractRoutingDataSource {
//
//
////    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<DatabaseType>();
////
//    @Override
////    protected Object determineCurrentLookupKey() {
////        DatabaseType type = DataSourceConfig.getDatabaseType();
////        logger.info("====================dataSource ==========" + type);
////        return type;
////
////    }
//
//
//}
