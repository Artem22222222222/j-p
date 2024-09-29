package org.example;

public class Main {
    public static void main(String[] args) {
        kilometersToMiles(160);
    }
    public static void milesToKilometers(double miles){
        System.out.println(miles*1.6);
    }
    public static void kilometersToMiles(double kilometers){
        System.out.println(kilometers/1.6);
    }
}