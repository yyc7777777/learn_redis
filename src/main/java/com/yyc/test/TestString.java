package com.yyc.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

public class TestString {

    private Jedis jedis;

    @Before
    public void before(){
        this.jedis = new Jedis("192.168.106.128",6379);
    }

    @After
    public void after(){
        jedis.close();
    }

    //测试String相关
    @Test
    public void testString(){

        //set
        jedis.set("qq","8693");
        //get
        String s = jedis.get("qq");
        System.out.println(s);
        //mset
        jedis.mset("content","好人","address","北京");
        //mget
        List<String> mget = jedis.mget("name", "content", "address");
        mget.forEach(v-> System.out.println("v = " + v));
        //getset
        String set = jedis.getSet("name", "哈哈哈");
        System.out.println(set);


    }



}
