package com.java.mix.oop;

/**
 * Created by andre on 20/11/16.
 */
public interface OperateCar {

    /*
    Consider using interfaces if any of these statements apply to your situation:
    - You expect that unrelated classes would implement your interface!!!! For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
    - You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
    - You want to take advantage of multiple inheritance of type.
     */

    // constant declarations, if any

    // method signatures

    int turn(boolean direction,
             double radius,
             double startSpeed,
             double endSpeed);

    int changeLanes(boolean direction,
                    double startSpeed,
                    double endSpeed);

    int signalTurn(boolean direction,
                   boolean signalOn);

    int getRadarFront(double distanceToCar,
                      double speedOfCar);

    int getRadarRear(double distanceToCar,
                     double speedOfCar);
}
