package com.company;


public class Boss {
    private int bossHealth;
    private int bossPunch;
    private String bossDefence;

    public Boss() {
    }

    public Boss(int bossHealth, int bossPunch, String bossDefence) {
        this.bossHealth = bossHealth;
        this.bossPunch = bossPunch;
        this.bossDefence = bossDefence;
    }

    public int getbossHealth() {
        return bossHealth;
    }

    public void setbossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getbossPunch() {
        return bossPunch;
    }

    public void setbossPunch(int bossPunch) {
        this.bossPunch = bossPunch;
    }

    public void setbossDefence(String fireShield) {
    }

    public String getbossDefence() {
        return bossDefence;
    }

    public void bossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }


}

