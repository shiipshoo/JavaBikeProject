package com.company;

public class WheelSet implements SpeedInterface{
    private final WSRims rims = new WSRims();
    private final WSTire tire = new WSTire();
    private final WSHub hub = new WSHub();

    @Override
    public void slowDown() {
        hub.decreaseHubRotation();
        System.out.println("Bike slowing down");
    }
    @Override
    public void speedUp() {
        hub.increaseHubRotation();
        System.out.println("Bike speeding up");
    }
    public void getWheelSetParts(){
        System.out.println("WheelSet Parts: " + rims.getRimType()
                            + ", " + tire.getTireType() + ", " + hub.getHubType());
    }
}
