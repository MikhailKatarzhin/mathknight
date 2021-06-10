package com.example.mathknight.domain.model.battle;

import java.math.BigInteger;

public class Battle {

    private BigInteger idBattle;
    private String leftParticipant;
    private String rightParticipant;
    private int battleTime;

    public Battle(BigInteger idBattle,String leftParticipant, String rightParticipant, int battleTime) {
        this.idBattle = idBattle;
        this.leftParticipant = leftParticipant;
        this.rightParticipant = rightParticipant;
        this.battleTime = battleTime;
    }

    public void setLeftParticipant(String leftParticipant) {
        this.leftParticipant = leftParticipant;
    }

    public void setRightParticipant(String rightParticipant) {
        this.rightParticipant = rightParticipant;
    }

    public void setBattleTime(int battleTime) {
        this.battleTime = battleTime;
    }

    public String getLeftParticipant() {
        return leftParticipant;
    }

    public String getRightParticipant() {
        return rightParticipant;
    }

    public int getBattleTime() {
        return battleTime;
    }

    public BigInteger getIdBattle() {
        return idBattle;
    }

    public void setIdBattle(BigInteger idBattle) {
        this.idBattle = idBattle;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "idBattle=" + idBattle +
                ", leftParticipant='" + leftParticipant + '\'' +
                ", rightParticipant='" + rightParticipant + '\'' +
                ", battleTime=" + battleTime +
                '}';
    }
}
