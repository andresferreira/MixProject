package com.java.mix.oop;

/**
 * Created by v-andfer on 20/11/2016.
 */
public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;
    protected int p;

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
}
