package com.example.mathknight.data.user.user_settings;

import com.example.mathknight.domain.model.user.UserSettings;

import java.util.List;

public interface UserSettingsStorage {
    List<UserSettings> getAllUserSettings();

}
