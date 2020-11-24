package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setbossHealth(999);
        boss.setbossPunch(100);
        boss.setbossDefence("fireShield");
        System.out.println(boss.getbossHealth()
                + "- Boss health "
                + boss.getbossPunch() + "- Boss punch "
                + boss.getbossDefence() + "- Boss defence");
    }
}
