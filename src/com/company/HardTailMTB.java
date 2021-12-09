package com.company;

public class HardTailMTB extends MTB{
    //Hard tail bike
    private final Frame htFrame = new HTFrame();
    HardTailMTB(Brake brake) {
        super(brake);
        System.out.println("Hard tail MTB");
    }
    public void displayBikeInfo(){
        super.displayBikeInfo();
        htFrame.frameWork();
    }
}
