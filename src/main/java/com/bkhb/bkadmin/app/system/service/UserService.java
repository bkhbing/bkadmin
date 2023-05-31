package com.bkhb.bkadmin.app.system.service;

import com.bkhb.bkadmin.app.system.pojo.entity.User;

import java.util.List;

/**
 * 用户service接口
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/29 15:54
 */
public interface UserService {
    List<User> list();

    /**
     * 添加用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    User updateUser(User user);

    void deleteUserById(Long id);
}
