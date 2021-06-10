package com.example.mathknight.domain.model.user;

import java.util.Date;

public class Personality {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthdate;
    private String nickname;

    public Personality(String firstName, String lastName, String patronymic, Date birthdate, String nickname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.nickname = nickname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Personality{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthdate=" + birthdate +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
