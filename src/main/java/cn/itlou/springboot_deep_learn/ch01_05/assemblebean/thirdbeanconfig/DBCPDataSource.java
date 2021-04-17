package cn.itlou.springboot_deep_learn.ch01_05.assemblebean.thirdbeanconfig;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author yuanyl
 * @date 2021/4/17 15:24
 **/
public class DBCPDataSource {

    @Bean("dataSource")
    public DataSource getDataSource() {
        Properties properties = new Properties();
        properties.setProperty("", "");
        properties.setProperty("", "");
        properties.setProperty("", "");
        properties.setProperty("", "");
        BasicDataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
