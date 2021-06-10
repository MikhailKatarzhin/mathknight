package com.example.mathknight.data.user.personality;

import com.example.mathknight.data.user.priority.PriorityRowMapper;
import com.example.mathknight.domain.model.user.Personality;
import com.example.mathknight.domain.model.user.PriorityEnemy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PersonalitySql implements PersonalityStorage {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Personality> getAllPersonality() {
        List<Personality> priorityEnemyList = null;

        StringBuilder sqlQuery = new StringBuilder("select * from personality");

        priorityEnemyList = jdbcTemplate.query(sqlQuery.toString(), new PersonalityRowMapper());

        return priorityEnemyList;
    }
}
