package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle trabant = new Vehicle(1,100, "Trabi");
        System.out.println("Name: " + trabant.printName());
        trabant.calculatePower();

        Vehicle ferrari = new Vehicle(500,150, "Rosa");
        System.out.println("Name: " + ferrari.printName());
        ferrari.calculatePower();
    }
}
