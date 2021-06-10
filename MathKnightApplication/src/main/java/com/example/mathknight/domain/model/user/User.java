package com.example.mathknight.domain.model.user;

import java.util.HashSet;
import java.util.Set;

public class User {

    private String email;
    private String passwordHash;
    private String role;
    private int rank;
    private boolean enabled;
    private Personality personality;
    private UserSettings userSettings;
    private PriorityEnemy priorityEnemy;

    public User(String email, String passwordHash, String role, int rank, boolean enabled, Personality personality, UserSettings userSettings, PriorityEnemy priorityEnemy) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.rank = rank;
        this.enabled = enabled;
        this.personality = personality;
        this.userSettings = userSettings;
        this.priorityEnemy = priorityEnemy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Set<Role> getRole() {
        Set<Role> userRoles = new HashSet<>();

        if (role != null && role.length() > 0) {

            String[] rolesArr = role.split(",");
            for (String role : rolesArr) {
                userRoles.add(Role.valueOf(role));
            }
        }

        return userRoles;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Personality getPersonality() {
        return personality;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    public PriorityEnemy getPriorityEnemy() {
        return priorityEnemy;
    }

    public void setPriorityEnemy(PriorityEnemy priorityEnemy) {
        this.priorityEnemy = priorityEnemy;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", role='" + role + '\'' +
                ", rank=" + rank +
                ", personality=" + personality +
                ", userSettings=" + userSettings +
                ", priorityEnemy=" + priorityEnemy +
                '}';
    }
}
