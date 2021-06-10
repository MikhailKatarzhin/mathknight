package com.example.mathknight.data.user.user;

import com.example.mathknight.domain.model.user.User;

import java.util.List;

public interface UserStorage {

    List<User> getAllUser(String name);


}
