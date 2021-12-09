package com.company;

public class DriveTrain {
    private final SpeedInterface si = new WheelSet();
    private final DTChain dtChain = new DTChain();
    private final DTPedals dtPedals = new DTPedals();
    private final DTGears dtGears = new DTGears();
    private final DTCrankSet dtCrankSet = new DTCrankSet();
    private int speed;

    public int getSpeed() {
        return speed;
    }
    private void pedalSpecificMethod(){
        dtPedals.stepPedal();
        dtCrankSet.rotateCrankSet();
        dtGears.rotateGears();
        dtGears.pullChain();
        dtChain.rotateChain();
    }
    public void pedalMethod(int speed, int incrementSpeed){
        if(incrementSpeed < 0){
            System.out.println("Current speed: " + speed);
            System.out.println("Applied pedal: " + incrementSpeed);
            System.out.println("Invalid speed");
        }else{
            System.out.println("Current speed: " + speed);
            System.out.println("Applied pedal: " + incrementSpeed);
            speed +=incrementSpeed;
            this.speed = speed;
            pedalSpecificMethod();
            si.speedUp();
            System.out.println("New speed: " +this.speed);
        }
    }

}
