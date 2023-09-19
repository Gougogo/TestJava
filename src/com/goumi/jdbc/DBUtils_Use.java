package com.goumi.jdbc;

import com.goumi.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class DBUtils_Use {
    @Test
    public void testQueryMary() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id >= ? and id <= ?";
        //最后一个参数是给sql中的问号赋值，所以是可变形参。
        List<Actor> query = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 2, 5);
        for (Actor actor : query) {
            System.out.println(actor);
        }

        JDBCUtilsByDruid.closeConnection(null, null, connection);
    }
}
