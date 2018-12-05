package com.company;

public class Taschenrechner {
    public static int summe ( int a, int b){
        return a+b;
    }
    public static int subtraktion (int a, int b){
        return a-b;

    }
    public static int multiplikation( int a, int b){
        return a*b;
    }
   public static int teilen(int a,int b){
        return a/b;
   }
   public static double summe (double a,double b){
        return a+b;

   }
    public static double subtraktion (double a, double b){
        return a-b;
    }
    public static double multiplikation( double a, double b) {
        return a * b;
    }
        public static double teilen( double a, double b){
            return a/b;
    }

    public static void main(String[] args) {
        System.out.println(summe(3,4));
        System.out.println(subtraktion(4,3));
        System.out.println(multiplikation(4,3));
        System.out.println(teilen(4,3));
        System.out.println(summe(3,4));
        System.out.println(subtraktion(4,3));
        System.out.println( multiplikation( 4.,3));
        System.out.println( teilen( 4.6,3.1));


    }




}

