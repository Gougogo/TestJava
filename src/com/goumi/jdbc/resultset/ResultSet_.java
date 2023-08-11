package com.goumi.jdbc.resultset;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String root = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Connection connect = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp_db02", properties);
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from hsp_db02.actor");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                String phone = resultSet.getString(5);
                System.out.println(id+","+name+","+sex+","+date+","+phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException("数据库异常", e);
        } finally {
            resultSet.close();
            statement.close();
            connect.close();
        }
    }
}
