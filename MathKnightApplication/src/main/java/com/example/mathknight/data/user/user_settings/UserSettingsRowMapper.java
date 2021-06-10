package com.example.mathknight.data.user.user_settings;

import com.example.mathknight.domain.model.user.UserSettings;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSettingsRowMapper implements RowMapper<UserSettings> {
    @Override
    public UserSettings mapRow(ResultSet resultSet, int i) throws SQLException {
        UserSettings userSettings = null;

        userSettings.setOpv(resultSet.getInt("own_physical_value"));
        userSettings.setOmv(resultSet.getInt("own_mental_value"));
        userSettings.setEpv(resultSet.getInt("Enemy_physical_value"));
        userSettings.setEmv(resultSet.getInt("Enemy_mental_value"));

        return userSettings;
    }
}
