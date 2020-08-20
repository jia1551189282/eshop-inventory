package com.jiajia.eshop.inventory.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jiajia.eshop.inventory.dao.RedisDao;
import com.jiajia.eshop.inventory.mapper.UserMapper;
import com.jiajia.eshop.inventory.model.User;
import com.jiajia.eshop.inventory.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zjiajia
 * @date 2020/8/20 20:01
 *
 * 用户service 实现类
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private RedisDao redisDao;


    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public User getCachedUserInfo() {
        redisDao.set("cached_user_lisi", "{\"name\": \"lisi\", \"age\":28}");

        String userJSON = redisDao.get("cached_user_lisi");
        JSONObject userJSONObject = JSONObject.parseObject(userJSON);

        User user = new User();
        user.setName(userJSONObject.getString("name"));
        user.setAge(userJSONObject.getInteger("age"));

        return user;
    }
}
