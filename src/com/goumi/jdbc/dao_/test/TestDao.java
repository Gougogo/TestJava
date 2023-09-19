package com.goumi.jdbc.dao_.test;

import com.goumi.jdbc.dao_.dao.ActorDao;
import com.goumi.jdbc.dao_.domin.Actor;

import java.util.Iterator;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class TestDao {
    public void testActorDao(){
        ActorDao actorDao = new ActorDao();
        List<Actor> show_tables = actorDao.queryMulti("show tables", Actor.class, null);
        Iterator<Actor> iterator = show_tables.iterator();
        while (iterator.hasNext()){
            Actor next = iterator.next();
            System.out.println(next);
        }
    }
}
