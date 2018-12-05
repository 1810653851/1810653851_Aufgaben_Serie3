package com.company;
import javax.swing.*;
public class Uebung_3PKZ {
    public static String halve( String s){
        int lenght= s.length();
        if(lenght<3){
            System.err.println();
            return null;

        }
        return s.substring (lenght/2);

    }
    public static void main (String[] args){
        String s1 = JOptionPane.showInputDialog("Gib die ersten Wert an");
        JOptionPane.showMessageDialog(null, halve(s1));

    }
}
