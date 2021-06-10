package com.example.mathknight.data.user.user;

import com.example.mathknight.domain.model.user.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = null;

        user.setEmail(resultSet.getString("Email"));
        user.setPasswordHash(resultSet.getString("Password_hash"));
        user.setRole(resultSet.getString("id_Role"));
        user.setRank(resultSet.getInt("Rank"));

        return user;

    }
}
