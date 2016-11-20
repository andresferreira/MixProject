package com.java.mix.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bicycle bicycle = new Bicycle(1,1,1);
        MountainBike mountainBike = new MountainBike(1,1,1,1);
        int x = mountainBike.p;
        System.out.println( "Hello World!" );
    }
}
