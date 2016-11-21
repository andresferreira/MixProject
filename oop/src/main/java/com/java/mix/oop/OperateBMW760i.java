package com.java.mix.oop;

/**
 * Created by andre on 20/11/16.
 */
public class OperateBMW760i implements OperateCar, Machine {

    /*
        Methods from OperateCar Interface
    */

    public int turn(boolean direction, double radius, double startSpeed, double endSpeed) {
        return 0;
    }

    public int changeLanes(boolean direction, double startSpeed, double endSpeed) {
        return 1;
    }

    public int signalTurn(boolean direction, boolean signalOn) {
        return 2;
    }

    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 3;
    }

    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 4;
    }



    /*
        Methods from Machine Interface
     */

    public void energy() {
        System.out.println("EAT EAT EAT!!!");
    }

    public void size() {
        System.out.print(size);
    }
}
