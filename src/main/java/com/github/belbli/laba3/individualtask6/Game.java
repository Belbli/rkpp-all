package com.github.belbli.laba3.individualtask6;

public class Game extends Software {
    private String genre;
    private Integer minAge;

    public Game(String name, String issuer, Double cost, String targetOS, String genre, Integer minAge) {
        super(name, issuer, cost, targetOS);
        this.genre = genre;
        this.minAge = minAge;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }
}
