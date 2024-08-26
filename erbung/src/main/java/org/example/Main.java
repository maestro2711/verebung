package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("BMWW","Corolla",2010);
        System.out.println(vehicle);


        Car car = new Car("VW","Fox",2010,4);
        System.out.println(car);

        Motocycle motocycle = new Motocycle("BS","yunda",2015,"reader",2000);
        System.out.println(motocycle);


    }
}