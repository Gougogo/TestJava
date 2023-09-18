package com.goumi.jdbc;

import com.goumi.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class C3P0_ {
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

        comboPooledDataSource.getConnection();

    }

    public static void main(String[] args) {

    }
}
