package com.jiajia.eshop.inventory.dao.impl;

import com.jiajia.eshop.inventory.dao.RedisDao;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * @author zjiajia
 * @date 2020/8/20 20:02
 */
@Repository("redisDao")
public class RedisDaoImpl implements RedisDao {

    @Resource
    private JedisCluster jedisCluster;


    @Override
    public void set(String key, String value) {
        jedisCluster.set(key,value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }
}
