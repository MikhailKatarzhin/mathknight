package com.example.mathknight.data.user.user_settings;

import com.example.mathknight.domain.model.user.UserSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserSettingsSql implements UserSettingsStorage {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<UserSettings> getAllUserSettings() {
        List<UserSettings> userSettingsList = null;

        StringBuilder sqlQuery = new StringBuilder("SELECT * from user_settings");

        userSettingsList = jdbcTemplate.query(sqlQuery.toString(), new UserSettingsRowMapper());

        return userSettingsList;
    }
}
