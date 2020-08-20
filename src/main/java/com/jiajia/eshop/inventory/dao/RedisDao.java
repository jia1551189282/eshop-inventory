package com.jiajia.eshop.inventory.dao;

/**
 * @author zjiajia
 * @date 2020/8/20 20:02
 */
public interface RedisDao {
    /**
     * 设置缓存
     * @param key       键
     * @param value     值
     */
    void set(String key, String value);

    /**
     * 获取值
     * @param key   键
     * @return      值
     */
    String get(String key);
}
