package com.java.mix.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*** Inheritance examples ***/

        Bicycle      bicycle      = new Bicycle(1,1,1);
        MountainBike mountainBike = new MountainBike(1,1,1,1);

        // setCadence method only defined in Bicycle class
        bicycle.setCadence(0);
        mountainBike.setCadence(0);

        // protectedVariable only defined in Bicycle class
        int x = mountainBike.protectedVariable;

        // toString
        System.out.println(bicycle.toString());
        System.out.println(mountainBike.toString());



        /*** Polymorphism examples ***/

        Bicycle      bicycle2      = new Bicycle(1,1,1);
        Bicycle      bicycle3      = new MountainBike(1,1,1,1);

        // toString
        System.out.println(bicycle2.toString());
        System.out.println(bicycle3.toString());

        bicycle2.printDescription();
        bicycle3.printDescription();



        /*** Abstract examples ***/

        /* You cannot instantiate
        Following is not allowed and would raise error */
        // Employee e = new Employee("George W.", "Houston, TX", 43);

        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();



        /*** Interface examples ***/

        // You cannot instantiate interfaces

        OperateBMW760i bmw760i = new OperateBMW760i();
        bmw760i.energy();
    }
}
