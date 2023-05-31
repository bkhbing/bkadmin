package com.bkhb.bkadmin.app.system.repository;

import com.bkhb.bkadmin.app.system.pojo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 用户接口
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/29 15:53
 */
public interface UserRepository extends JpaRepository<User, Long>, Serializable {
    /**
     * 相当于 select *from user where name=?
     * @param userName
     * @return
     */
    public User findByUserName(String userName);
}
