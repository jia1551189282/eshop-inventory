package com.jiajia.eshop.inventory.service;

import com.jiajia.eshop.inventory.model.User;

/**
 * @author zjiajia
 * @date 2020/8/20 20:01
 *
 * 用户sevice 接口
 */
public interface UserService {

    /**
     * 查询用户信息
     * @return 用户信息
     */
    public User findUserInfo();

    /**
     * 查询redis中缓存的用户信息
     * @return
     */
    public User getCachedUserInfo();
}
