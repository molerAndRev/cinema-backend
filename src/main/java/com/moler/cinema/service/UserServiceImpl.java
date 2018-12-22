package com.moler.cinema.service;

import com.moler.cinema.entity.Users;
import com.moler.cinema.repository.UserRepository;
import com.moler.cinema.requests.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users register(UserRegisterRequest request) {
        Users user = Users.builder()
                .email(request.getEmail())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .phone(request.getPhone())
                .active(1)
                .build();
        return userRepository.save(user);
    }
}
