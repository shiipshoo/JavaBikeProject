package com.company;

public class RotorBrake extends Brake{
    private final RotorPads rotorPads = new RotorPads();
    private final RotorBrakeLever rotorBrakeLever = new RotorBrakeLever();
    private final RotorCaliper rotorCaliper = new RotorCaliper();
    private final RotorHydraulicHose rotorHydraulicHose = new RotorHydraulicHose();
    private final boolean isFull;

    RotorBrake(boolean isFull) {
        this.isFull = isFull;
    }
    @Override
    public void brakeSpecificMethod() {
        if(isFull){
            rotorHydraulicHose.isFull();
            rotorBrakeLever.stopOil();
            rotorHydraulicHose.isStopped();
            rotorCaliper.pushPads();
            rotorPads.isPushed();
        }else{
            rotorHydraulicHose.isEmpty();
            System.out.println("Cant brake please refill hose.");
        }

    }

    @Override
    public String getBrakeParts() {
        String brakeType = "Rotor Brake";
        return ("Type of brake: " + brakeType +
                "\nParts of brake: " + rotorPads.getPads()+
                ", " + rotorCaliper.getCaliper() + ", " +
                rotorBrakeLever.getBrakeLever() + ", "
                + rotorHydraulicHose.getHydraulicHose() );
    }
}
