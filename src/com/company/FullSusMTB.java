package com.company;

public class FullSusMTB extends MTB{
    //Full suspension bike
    private final Frame fsFrame = new FSFrame();
    FullSusMTB(Brake brake) {
        super(brake);
        System.out.println("Full suspension MTB");
    }
    public void displayBikeInfo(){
        super.displayBikeInfo();
        fsFrame.frameWork();
    }
}
