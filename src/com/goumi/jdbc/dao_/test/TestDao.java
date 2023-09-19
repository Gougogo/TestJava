package com.goumi.jdbc.dao_.test;

import com.goumi.jdbc.dao_.dao.ActorDao;
import com.goumi.jdbc.dao_.domin.Actor;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class TestDao {
    @Test
    public void testActorDao(){
        ActorDao actorDao = new ActorDao();
        List<Actor> show_tables = actorDao.queryMulti("select * from actor", Actor.class, null);
        Iterator<Actor> iterator = show_tables.iterator();
        while (iterator.hasNext()){
            Actor next = iterator.next();
            System.out.println(next);
        }
    }
}
