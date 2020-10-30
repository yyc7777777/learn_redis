package com.yyc.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

public class TestList {

    private Jedis jedis;

    @Before
    public void before(){
        this.jedis = new Jedis("192.168.106.128",6379);
    }

    @After
    public void after(){
        jedis.close();
    }

    //测试List相关
    @Test
    public void testList(){

        //lpush
        jedis.lpush("name1","zhangsa","wangwang","zhaoliu","win7");
        //rpush
        jedis.rpush("name1","xiaoming","xiaohong","xiaoli");
        //lrange
        List<String> name1 = jedis.lrange("name1", 0, -1);
        name1.forEach(name-> System.out.println("name = " + name));

        //lpop



    }



}
