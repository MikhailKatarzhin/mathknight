package com.example.mathknight.domain.model.user;

public class PriorityEnemy {
    private String ownEmail;
    private String enemyEmail;

    public PriorityEnemy(String ownEmail, String enemyEmail) {
        this.ownEmail = ownEmail;
        this.enemyEmail = enemyEmail;
    }

    public void setOwnEmail(String ownEmail) {
        this.ownEmail = ownEmail;
    }

    public void setEnemyEmail(String enemyEmail) {
        this.enemyEmail = enemyEmail;
    }

    public String getOwnEmail() {
        return ownEmail;
    }

    public String getEnemyEmail() {
        return enemyEmail;
    }

    @Override
    public String toString() {
        return "PriorityEnemy{" +
                "ownEmail='" + ownEmail + '\'' +
                ", enemyEmail='" + enemyEmail + '\'' +
                '}';
    }
}
