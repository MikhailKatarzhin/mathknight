package com.example.mathknight.data.battle;

import com.example.mathknight.domain.model.battle.Battle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class BattleRowMapper implements RowMapper<Battle> {
    @Override
    public Battle mapRow(ResultSet resultSet, int i) throws SQLException {
        Battle battle = null;

        battle.setLeftParticipant(resultSet.getString("Left_participant_email"));
        battle.setRightParticipant(resultSet.getString("Right_participant_email"));
        battle.setBattleTime(resultSet.getInt("Battle_time"));

        return battle;
    }
}
