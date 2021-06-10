package com.example.mathknight.data.user.user;

import com.example.mathknight.domain.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserStorageSql implements UserStorage {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> getAllUser(String name) {
        List<User> userList = null;

        StringBuilder sqlQuery = new StringBuilder("SELECT * from user");

        userList = jdbcTemplate.query(sqlQuery.toString(), new UserRowMapper());

        return userList;
    }



}
