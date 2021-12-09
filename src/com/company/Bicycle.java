package com.company;

public class Bicycle {
    private final WheelSet wheelSet = new WheelSet();
    private final Frame frame = new Frame();
    private final Brake brake;
    private final DriveTrain driveTrain= new DriveTrain();
    private int speed = 0;

    //create a bike with specific brake
    Bicycle (Brake brake){
        System.out.println("Creating Bicycle");
        this.brake = brake;
    }
    public void applyBrake(int decrementSpeed){
        brake.brakeMethod(speed, decrementSpeed);
        this.speed = brake.getSpeed();
    }
    public void applyPedal(int incrementSpeed){
        driveTrain.pedalMethod(speed, incrementSpeed);
        this.speed = driveTrain.getSpeed();
    }
    public void displayBikeInfo(){
        System.out.println(brake.getBrakeParts());
        wheelSet.getWheelSetParts();
        frame.frameWork();
    }
}
