package com.yyc.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestKey {

    private Jedis jedis;

    @Before
    public void before(){
        this.jedis = new Jedis("192.168.106.128",6379);
    }

    @After
    public void after(){
        jedis.close();
    }

    //测试key相关
    @Test
    public void testKeys(){
        //删除一个key
//        jedis.del("name");
        //删除多个key
//        jedis.del("name","age");

        //判断一个key是否存在exists
        Boolean name = jedis.exists("name");
        System.out.println(name);

        //设置一个key超时时间expire pexpire
//        Long age = jedis.expire("age", 100);
//        System.out.println(age);

        //获取一个key超时时间 ttl
//        Long age1 = jedis.ttl("age");
//        System.out.println(age1);

        //随机获取一个key
        String s = jedis.randomKey();
        System.out.println(s);

        //修改key名称
//        String rename = jedis.rename("age", "newage");
//        System.out.println(rename);

        //查看key对应值的类型
        String name1 = jedis.type("name");
        System.out.println(name1);

    }



}
