package com.example.mathknight.data.user.priority;

import com.example.mathknight.domain.model.user.PriorityEnemy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PrioritySql implements PriorityStorage {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void SetDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate();
    }

    @Override
    public List<PriorityEnemy> getAllPriorityEnemy() {
        List<PriorityEnemy> priorityEnemyList = null;

        StringBuilder sqlQuery = new StringBuilder("SELECT * from priority_enemy");

        priorityEnemyList = jdbcTemplate.query(sqlQuery.toString(), new PriorityRowMapper());

        return null;
    }
}
