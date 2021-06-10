package com.example.mathknight.data.tournament.stage;

import com.example.mathknight.domain.model.tournament.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StageSql implements StageStorage {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Stage> getAllStage() {
        List<Stage> stageList = null;

        StringBuilder sqlQuery = new StringBuilder("SELECT * from tournament_stage");

        stageList = jdbcTemplate.query(sqlQuery.toString(), new StageRowMapper());

        return stageList;
    }
}
