package com.moler.cinema.Service;

import com.moler.cinema.entity.Users;
import com.moler.cinema.entity.builder.UsersBuilder;
import com.moler.cinema.repository.UserRepository;
import com.moler.cinema.requests.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users register(UserRegisterRequest request) {
        Users user = new UsersBuilder()
                .setEmail(request.getEmail())
                .setFirstName(request.getFirstName())
                .setLastName(request.getLastName())
                .setPhone(request.getPhone())
                .build();
        user.setActive(1);
        return userRepository.save(user);
    }
}
