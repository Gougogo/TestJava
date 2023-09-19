package com.goumi.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Druid_ {
    @Test
    public void testDruid() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        PreparedStatement show_tables = connection.prepareStatement("show tables");
        ResultSet resultSet = show_tables.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
        connection.close();
        show_tables.close();
        resultSet.close();
    }
}
