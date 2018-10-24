package com.forezp.helloworld;

import com.forezp.helloworld.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {


    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis() {
        redisDao.setString("name", "王超群", 2L, TimeUnit.MINUTES);
        redisDao.setString("age", "18");
        System.out.println("name : " + redisDao.getString("name"));
        System.out.println("age : " + redisDao.getString("age"));
    }

}
