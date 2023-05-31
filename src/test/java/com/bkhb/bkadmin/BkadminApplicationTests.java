package com.bkhb.bkadmin;

import com.bkhb.bkadmin.app.system.pojo.entity.User;
import com.bkhb.bkadmin.app.system.repository.UserRepository;
import com.bkhb.bkadmin.app.system.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BkadminApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(1L);
        user.setUserName("fyh123");
        userService.updateUser(user);
    }

}
