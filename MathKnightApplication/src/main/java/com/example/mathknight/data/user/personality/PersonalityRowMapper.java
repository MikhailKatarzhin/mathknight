package com.example.mathknight.data.user.personality;

import com.example.mathknight.domain.model.user.Personality;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonalityRowMapper implements RowMapper<Personality> {
    @Override
    public Personality mapRow(ResultSet resultSet, int i) throws SQLException {
        Personality personality = null;

        personality.setFirstName(resultSet.getString("First_name"));
        personality.setLastName(resultSet.getString("Second_name"));
        personality.setPatronymic(resultSet.getString("Patronymic"));
        personality.setBirthdate(resultSet.getDate("Birth date"));
        personality.setNickname(resultSet.getString("Nickname"));

        return personality;
    }
}
