package com.example.mathknight.data.user.priority;

import com.example.mathknight.domain.model.user.PriorityEnemy;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PriorityRowMapper implements RowMapper<PriorityEnemy> {
    @Override
    public PriorityEnemy mapRow(ResultSet resultSet, int i) throws SQLException {
        PriorityEnemy priorityEnemy = null;

        priorityEnemy.setOwnEmail(resultSet.getString("Own_email"));
        priorityEnemy.setEnemyEmail(resultSet.getString("Enemy_email"));

        return null;
    }
}
