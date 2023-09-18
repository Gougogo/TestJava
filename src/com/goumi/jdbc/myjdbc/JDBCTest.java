package com.goumi.jdbc.myjdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @version 1.0
 * @auther GouMi
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "studymysql");
        Connection connect = driver.connect("jdbc:mysql://localhost:3306/hsp_db02", properties);
        Statement statement = connect.createStatement();
        ResultSet show_tables = statement.executeQuery("show tables");
        while (show_tables.next()){
            System.out.println(show_tables.getString(1));
        }

        statement.close();
        connect.close();
    }
}

/*
1:数据库连接异常
2：空指针异常
3：数组越界
4：数学异常
5：文件io异常
6：内存溢出异常
 */
