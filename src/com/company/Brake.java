package com.company;

public abstract class Brake {
    int speed;
    SpeedInterface si = new WheelSet();
    abstract String getBrakeParts();
    abstract void brakeSpecificMethod();

    public int getSpeed() {
        return speed;
    }
    public void brakeMethod(int speed, int decrementSpeed) {
        System.out.println("Braking...");
        if (speed <= decrementSpeed) {
            System.out.println("Current speed: " + speed);
            System.out.println("Applied brake: " + decrementSpeed);
            brakeSpecificMethod();
            speed = 0;
            this.speed = speed;
        } else {
            System.out.println("Current speed: " + speed);
            System.out.println("Applied brake: " + decrementSpeed);
            speed -= decrementSpeed;
            this.speed = speed;
            brakeSpecificMethod();

        }
        si.slowDown();
        System.out.println("New speed: " +this.speed);

    }
}
