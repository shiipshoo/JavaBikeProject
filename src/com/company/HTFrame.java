package com.company;

public class HTFrame extends Frame{
    //Hard tail frame
    private final HTSuspension htSuspension = new HTSuspension();
    private final HTFork htFork = new HTFork();
    private final HTHandleBars htHandleBars = new HTHandleBars();

    public void frameWork(){
        String frameType = "Hard tail Frame";
        System.out.println("Frame type: "+ frameType);
        System.out.println("Frame Parts: " + htSuspension.getSuspension()
                            + ", " + htFork.getForkType() + ", "
                            + htHandleBars.getHandleBarType());
    }
}
