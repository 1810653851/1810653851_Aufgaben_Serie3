package com.company;

import javax.swing.*;

public class Vehicle {
    private int power;
    private double weight;
    private String name;

    public Vehicle(int pow, double w, String nam){
        this.power = pow;
        this.weight = w;
        this.name = nam;
    }
    public String printName() {
        return this.name;
    }

    public void calculatePower(){
        JOptionPane.showMessageDialog(null,"Die kraft in PS: "+ this.power * 1.36);
    }

}
