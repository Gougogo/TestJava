package com.goumi.jdbc.myjdbc;


import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new Driver();

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "studymysql");

        Connection connect = null;
        Statement statement = null;
        try {
            connect = driver.connect("jdbc:mysql://localhost:3306/hsp_db02", properties);
            statement = connect.createStatement();
            int rows = statement.executeUpdate("insert into actor values(null, '刘德华', '男', '1970-11-11', '110')");
            System.out.println(rows>0 ? "yes" : "no");
        } catch (SQLException e) {
            throw new RuntimeException("数据库异常", e);
        } finally {
            statement.close();
            connect.close();
        }
    }
}
