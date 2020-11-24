package com.company;

public class Hero {

        private int heroHealth;
        private int heroPunch;
        private String superPower;

        public Hero (){}

        public Hero( int heroHealth, int heroPunch, String superPower){

            this.heroHealth = heroHealth;
            this.heroPunch = heroPunch;
            this.superPower = superPower;
        }
        public Hero(int heroHealth, int heroPunch){

            this.heroHealth = heroHealth;
            this.heroPunch = heroPunch;
        }

        public int getheroHealth() {
            return heroHealth;
        }

        public int getheroPunch() {
            return heroPunch;
        }

        public String getSuperPower() {
            return superPower;
        }
}
