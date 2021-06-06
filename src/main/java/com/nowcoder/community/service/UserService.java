package com.nowcoder.community.service;

import com.nowcoder.community.entity.LoginTicket;
import com.nowcoder.community.entity.User;

import java.util.Map;

public interface UserService {

    User findUserById(int id);

    Map<String, Object> register(User user);

    int activation(int userId, String code);

    Map<String, Object> login(String username, String password, int expiredSecond);

    void logout(String ticket);

    LoginTicket findLoginTicket(String ticket);

    Map<String, Object> updatePassword(int userId, String oldPassword, String newPassword);

    User findUserByName(String username);
}
