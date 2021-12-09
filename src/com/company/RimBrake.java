package com.company;

public class RimBrake extends Brake{
    private final RimCable rimCable = new RimCable();
    private final RimBrakeLever rimBrakeLever = new RimBrakeLever();
    private final RimPads rimPads = new RimPads();
    private final RimCaliper rimCaliper = new RimCaliper();

    @Override
    public void brakeSpecificMethod() {
        rimBrakeLever.pullCable();
        rimCable.isPulled();
        rimCaliper.pushPads();
        rimPads.isPushed();
    }

    @Override
    public String getBrakeParts() {
        String brakeType = "Rim Brake";
        return ("Type of brake: " + brakeType +
                "\nParts of brake: " + rimBrakeLever.getBrakeLeverType()+
                ", " + rimCable.getCableType() + ", " +
                rimPads.getPadsType() + ", " + rimCaliper.getCaliperType() );
    }

}
