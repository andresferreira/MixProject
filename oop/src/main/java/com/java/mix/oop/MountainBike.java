package com.java.mix.oop;

/**
 * Created by v-andfer on 20/11/2016.
 */
public class MountainBike extends Bicycle {

    // A Java class can only extend one parent class. Multiple inheritance is not allowed.

    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return "MountainBike{}";
    }


    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a suspension.");
    }
}
