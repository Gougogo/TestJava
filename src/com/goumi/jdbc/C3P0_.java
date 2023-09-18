package com.goumi.jdbc;

import com.goumi.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class C3P0_ {

    @Test
    public void testC3P0() throws PropertyVetoException, SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(JDBCUtils.getDriver());
        comboPooledDataSource.setJdbcUrl(JDBCUtils.getUrl());
        comboPooledDataSource.setUser(JDBCUtils.getUser());
        comboPooledDataSource.setPassword(JDBCUtils.getPassword());
        //初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            //connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("c3p0 need " + (end-start));
    }

    public static void main(String[] args) throws SQLException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = JDBCUtils.getConnection();
            JDBCUtils.close(null, null, connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("traditional need " + (end-start));
    }
}
