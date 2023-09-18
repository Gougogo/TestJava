package com.goumi.jdbc.myjdbc;

import com.goumi.utils.JDBCUtils;

import java.sql.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class JDBCUtils_ {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtils.getConnection();

        String sql = "show tables";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }

        JDBCUtils.close(resultSet, preparedStatement, connection);
    }
}
