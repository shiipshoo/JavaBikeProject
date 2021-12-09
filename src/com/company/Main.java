package com.company;

public class Main {

    public static void main(String[] args) {
        //Creating bicycle with brake
        Bicycle b = new Bicycle(new RimBrake());
        b.displayBikeInfo();

        System.out.println("--------");

        //Create hardtail mtb rotorbrake
        HardTailMTB ht = new HardTailMTB(new RotorBrake(true));
        ht.displayBikeInfo();

        System.out.println("---Pedal---");
        ht.applyPedal(60);

        System.out.println("---Brake----");
        ht.applyBrake(43);


        //Create fullsus mtb rimbrake
        System.out.println("--------");
        FullSusMTB fs = new FullSusMTB(new RimBrake());

        fs.displayBikeInfo();

        System.out.println("---Pedal---");
        fs.applyPedal(21);

        System.out.println("---Brake----");
        fs.applyBrake(12);
    }
}
