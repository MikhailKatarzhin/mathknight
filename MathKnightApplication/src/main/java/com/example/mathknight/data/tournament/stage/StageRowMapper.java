package com.example.mathknight.data.tournament.stage;

import com.example.mathknight.domain.model.tournament.Stage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StageRowMapper implements RowMapper<Stage> {
    @Override
    public Stage mapRow(ResultSet resultSet, int i) throws SQLException {
        Stage stage = null;

        stage.setIdStage(resultSet.getInt("id_stage"));
        stage.setDateEnd(resultSet.getDate("Date_end"));
        stage.setRank(resultSet.getInt("Stage_rank"));
        stage.setCountParticipants(resultSet.getInt("Stage_rank"));

        return stage;
    }
}
