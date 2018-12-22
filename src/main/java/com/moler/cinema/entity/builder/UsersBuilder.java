package com.moler.cinema.entity.builder;

import com.moler.cinema.entity.Users;

public class UsersBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public UsersBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UsersBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UsersBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UsersBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Users build() {
        return new Users(firstName, lastName, email, phone);
    }
}