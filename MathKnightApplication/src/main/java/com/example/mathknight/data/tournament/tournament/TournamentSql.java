package com.example.mathknight.data.tournament.tournament;

import com.example.mathknight.domain.model.tournament.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TournamentSql implements TournamentStorage {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Tournament> getAllTournament() {
        List<Tournament> tournamentList = null;

        StringBuilder sqlQuery = new StringBuilder("select * from tournament");

        tournamentList = jdbcTemplate.query(sqlQuery.toString(), new TournamentRowMapper());

        return tournamentList;
    }
}
