package com.dinodeliveries.service;

import com.dinodeliveries.dto.UserLoginDTO;
import com.dinodeliveries.entity.User;

public interface UserService {
    /**
     * 微信登入
     *
     * @param userLoginDTO
     * @return
     */
    User wxlogin(UserLoginDTO userLoginDTO);
}
