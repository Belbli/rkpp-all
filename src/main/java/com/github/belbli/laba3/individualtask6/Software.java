package com.github.belbli.laba3.individualtask6;

public class Software {
    private String name;
    private String issuer;
    private Double cost;
    private String targetOS;

    public Software(String name, String issuer, Double cost, String targetOS) {
        this.name = name;
        this.issuer = issuer;
        this.cost = cost;
        this.targetOS = targetOS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getTargetOS() {
        return targetOS;
    }

    public void setTargetOS(String targetOS) {
        this.targetOS = targetOS;
    }
}
