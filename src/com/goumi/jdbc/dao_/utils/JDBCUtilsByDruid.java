package com.goumi.jdbc.dao_.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @version 1.0
 * @auther GouMi
 */
public class JDBCUtilsByDruid {
    private static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static void closeConnection(ResultSet set, Statement statement, Connection connection){
        if (set != null){
            try {
                set.close();
            } catch (SQLException throwables) {
                throw new RuntimeException(throwables);
            }
        }

        if (statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throw new RuntimeException(throwables);
            }
        }

        if (connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throw new RuntimeException(throwables);
            }
        }
    }
}
