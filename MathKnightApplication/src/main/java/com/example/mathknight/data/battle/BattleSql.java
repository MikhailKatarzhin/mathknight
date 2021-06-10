package com.example.mathknight.data.battle;

import com.example.mathknight.domain.model.battle.Battle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class BattleSql implements BattleStorage {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Battle> getAllBattle() {
        List<Battle> battleList = null;

        StringBuilder sqlQuery = new StringBuilder("SELECT * from battle");

        battleList = jdbcTemplate.query(sqlQuery.toString(), new BattleRowMapper());

        return battleList;
    }
}
