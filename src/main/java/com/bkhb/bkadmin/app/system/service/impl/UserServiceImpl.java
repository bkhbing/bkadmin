package com.bkhb.bkadmin.app.system.service.impl;

import com.bkhb.bkadmin.app.system.pojo.entity.User;
import com.bkhb.bkadmin.app.system.repository.UserRepository;
import com.bkhb.bkadmin.app.system.service.UserService;
import com.bkhb.bkadmin.common.execption.EntityExistException;
import com.bkhb.bkadmin.common.execption.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 用户service类
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/29 15:55
 */
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        // 检查用户名是否存在
        if (userRepository.findByUserName(user.getUserName()) != null) {
            throw new EntityExistException(User.class, "userName", user.getUserName());
        }
        userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        if (userRepository.findById(user.getId()).isEmpty()) {
            throw new EntityNotFoundException(User.class, "id", String.valueOf(user.getId()));
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new EntityNotFoundException(User.class, "id", String.valueOf(id));
        }
        userRepository.deleteById(id);
    }
}
