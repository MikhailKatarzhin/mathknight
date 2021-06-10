package com.example.mathknight.domain.model.user;

public class UserSettings {
    private int opv;
    private int omv;
    private int epv;
    private int emv;

    public UserSettings(int opv, int omv, int epv, int emv) {
        this.opv = opv;
        this.omv = omv;
        this.epv = epv;
        this.emv = emv;
    }

    public int getOpv() {
        return opv;
    }

    public void setOpv(int opv) {
        this.opv = opv;
    }

    public int getOmv() {
        return omv;
    }

    public void setOmv(int omv) {
        this.omv = omv;
    }

    public int getEpv() {
        return epv;
    }

    public void setEpv(int epv) {
        this.epv = epv;
    }

    public int getEmv() {
        return emv;
    }

    public void setEmv(int emv) {
        this.emv = emv;
    }

    @Override
    public String toString() {
        return "UserSettings{" +
                "opv=" + opv +
                ", omv=" + omv +
                ", epv=" + epv +
                ", emv=" + emv +
                '}';
    }
}
