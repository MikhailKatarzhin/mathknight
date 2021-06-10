package com.example.mathknight.domain.service;

import com.example.mathknight.domain.model.user.User;

import java.util.List;

public interface UserService {

    List<User> getList();
    boolean isUserWithEmailExist(String email);

}
