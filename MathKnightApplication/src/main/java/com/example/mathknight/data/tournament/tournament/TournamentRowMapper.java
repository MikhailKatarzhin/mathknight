package com.example.mathknight.data.tournament.tournament;

import com.example.mathknight.domain.model.tournament.Stage;
import com.example.mathknight.domain.model.tournament.Tournament;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TournamentRowMapper implements RowMapper<Tournament> {
    @Override
    public Tournament mapRow(ResultSet resultSet, int i) throws SQLException {
        Tournament tournament = null;

        tournament.setTitle(resultSet.getString("Title"));
        tournament.setDataStart(resultSet.getDate("Date_start"));

        return tournament;
    }
}
