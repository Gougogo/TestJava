package com.goumi.jdbc.myjdbc;

import com.goumi.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class JDBCUtils_ {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtils.getConnection();
    }
}
