package com.goumi.jdbc.myjdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @version 1.0
 * @auther GouMi
 */
public class JavaMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp_db02", "root", "studymysql");

        String sql = "create table gou_goods(id int, name varchar(32), price double, introduce text)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
        System.out.println("ok");
    }
}
