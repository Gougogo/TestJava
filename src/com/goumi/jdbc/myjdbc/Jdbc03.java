package com.goumi.jdbc.myjdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc03 {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String root = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);


        Connection connect = null;
        Statement statement = null;
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp_db02", properties);
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
