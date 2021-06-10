package com.example.mathknight.domain.model.tournament;

import java.util.Date;
import java.util.Set;

public class Stage {

    private int idStage;
    private Date dateEnd;
    private int rank;
    private int countParticipants;
    private Set<String> participantEmail;

    public Stage(int idStage, Date dateEnd, int rank, int countParticipants, Set<String> participantEmail) {
        this.idStage = idStage;
        this.dateEnd = dateEnd;
        this.rank = rank;
        this.countParticipants = countParticipants;
        this.participantEmail = participantEmail;
    }

    public void setIdStage(int idStage) {
        this.idStage = idStage;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setCountParticipants(int countParticipants) {
        this.countParticipants = countParticipants;
    }

    public int getIdStage() {
        return idStage;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public int getRank() {
        return rank;
    }

    public int getCountParticipants() {
        return countParticipants;
    }

    public Set<String> getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(Set<String> participantEmail) {
        this.participantEmail = participantEmail;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "idStage=" + idStage +
                ", dateEnd=" + dateEnd +
                ", rank=" + rank +
                ", countParticipants=" + countParticipants +
                ", participantEmail=" + participantEmail +
                '}';
    }
}
