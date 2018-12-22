package com.moler.cinema.repository;

import com.moler.cinema.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
