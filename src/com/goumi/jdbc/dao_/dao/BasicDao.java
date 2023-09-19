package com.goumi.jdbc.dao_.dao;

import com.goumi.jdbc.dao_.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BasicDao<T> {
    private QueryRunner qr = new QueryRunner();
    private Connection connection = null;

    //开发通用的dml方法, 针对任意的表

    /**
     *
     * @param sql
     * @param pars
     * @return
     */
    public int update(String sql, Object... pars) {

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

    /**
     *
     * @param sql
     * @param clazz
     * @param pars
     * @return
     */
    public List<T> queryMulti(String sql, Class<T> clazz, Object ...pars){
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), pars);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.closeConnection(null, null, connection);
        }
    }

    /**
     *
     * @param sql
     * @param clazz
     * @param pars
     * @return
     */
    public T querySingle(String sql, Class<T> clazz, Object... pars){
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanHandler<T>(clazz), pars);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.closeConnection(null, null, connection);
        }
    }

    /**
     *
     * @param sql
     * @param pars
     * @return
     */
    public Object queryScalar(String sql, Object... pars){
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new ScalarHandler(), pars);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.closeConnection(null, null, connection);
        }
    }
}
