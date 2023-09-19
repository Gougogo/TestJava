package com.goumi.jdbc.dao_.dao;

import com.goumi.jdbc.dao_.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BasicDao<T> {
    private QueryRunner qr = new QueryRunner();

    public int update(String sql, Object... pars) {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            int update = qr.update(connection, sql, pars);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.closeConnection(null, null, connection);
        }
    }

}
