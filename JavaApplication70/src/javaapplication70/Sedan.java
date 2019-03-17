/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

/**
 *
 * @author PC
 */
public class Sedan implements PassengerCar {

    private int passenger = 0;
    private int max_passenger = 4;

    Sedan() {
        this.passenger = passenger;
        this.max_passenger = max_passenger;
    }

    Sedan(int pass, int max_pass) {
        this.passenger = pass;
        this.max_passenger = max_pass;
    }

    public int getPassenger() {
        return passenger;
    }

    public int getMax_passenger() {
        return max_passenger;
    }

    @Override
    public void addPassenger(int n) {
        System.out.println("Sedan with " + passenger+  " passenger add Passenger");
        passenger += n;
        if (max_passenger < passenger) {
            System.out.println("Too much passenger!!! " + (passenger - max_passenger) + " must wait");
            passenger = max_passenger;
        }
        System.out.println(passenger+" Passenger");
    }

    @Override
    public void removePassenger(int n) {
        System.out.println("Sedan remove Passenger");
    }

    @Override
    public void start() {
        System.out.println("Sedan start");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stop");
    }

}
