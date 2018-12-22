package com.moler.cinema.Service;

import com.moler.cinema.entity.Users;
import com.moler.cinema.requests.UserRegisterRequest;

public interface UserService {

    Users register(UserRegisterRequest request);
}
