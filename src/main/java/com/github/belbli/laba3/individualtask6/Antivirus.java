package com.github.belbli.laba3.individualtask6;

public class Antivirus extends Software {
    private String description;
    private Boolean autoRun;

    public Antivirus(String name, String issuer, Double cost, String targetOS, String description, Boolean autoRun) {
        super(name, issuer, cost, targetOS);
        this.description = description;
        this.autoRun = autoRun;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAutoRun() {
        return autoRun;
    }

    public void setAutoRun(Boolean autoRun) {
        this.autoRun = autoRun;
    }
}
