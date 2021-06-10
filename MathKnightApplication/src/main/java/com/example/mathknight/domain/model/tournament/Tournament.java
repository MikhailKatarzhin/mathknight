package com.example.mathknight.domain.model.tournament;

import java.util.Date;
import java.util.HashMap;

public class Tournament {

    private HashMap<Integer, Stage> stageHashMap;
    private String title;
    private Date dataStart;

    public Tournament(HashMap<Integer, Stage> stageHashMap, String title, Date dataStart) {
        this.stageHashMap = stageHashMap;
        this.title = title;
        this.dataStart = dataStart;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    public HashMap<Integer, Stage> getStageHashMap() {
        return stageHashMap;
    }

    public void setStageHashMap(HashMap<Integer, Stage> stageHashMap) {
        this.stageHashMap = stageHashMap;
    }

    public String getTitle() {
        return title;
    }

    public Date getDataStart() {
        return dataStart;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "stageHashMap=" + stageHashMap +
                ", title='" + title + '\'' +
                ", dataStart=" + dataStart +
                '}';
    }
}
