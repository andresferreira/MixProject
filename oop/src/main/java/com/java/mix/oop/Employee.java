package com.java.mix.oop;

/**
 * Created by andre on 20/11/16.
 */
public abstract class Employee {

    /**
     * Consider using abstract classes if any of these statements apply to your situation:
     - You want to share code among several closely related classes!!!
     - You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
     - You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
     */

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    /* If you want a class to contain a particular method but you want the actual implementation of that
       method to be determined by child classes, you can declare the method in the parent class as an abstract. */

    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}