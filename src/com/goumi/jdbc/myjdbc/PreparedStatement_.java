package com.goumi.jdbc.myjdbc;


import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.Properties;

/**
 * @version 1.0
 * @auther GouMi
 */
public class PreparedStatement_ {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "studymysql");
        Connection connect = driver.connect("jdbc:mysql://localhost:3306/hsp_db02", properties);
        PreparedStatement statement = connect.prepareStatement("show tables");
        ResultSet show_tables = statement.executeQuery();
        while (show_tables.next()){
            System.out.println(show_tables.getString(1));
        }

        statement.close();
        connect.close();

    }
}
