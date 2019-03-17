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
public interface ICar {
    void start();
    void stop();
}

interface PassengerCar extends ICar{
    void addPassenger(int n);
    void removePassenger(int n);
}

interface Truck extends ICar{
    void addLoad(int n);
    void removeLoad(int n);
}
