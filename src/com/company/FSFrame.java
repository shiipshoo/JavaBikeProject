package com.company;

public class FSFrame extends Frame{
    //Full suspension frame
    private final FSSuspension fsSuspension = new FSSuspension();
    private final FSFork fsFork = new FSFork();
    private final FSHandleBars fsHandleBars = new FSHandleBars();

    public void frameWork(){
        String frameType = "Full Suspension Frame";
        System.out.println("Frame type: "+ frameType);
        System.out.println("Frame Parts: " + fsHandleBars.getHandleBarsType()
                + ", " + fsFork.getForkType() + ", "
                + fsSuspension.getSuspension());
    }

}
