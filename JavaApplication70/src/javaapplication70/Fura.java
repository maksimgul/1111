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
public class Fura implements Truck{

    @Override
    public void start() {
        System.out.println("Pickup start");
    }

    @Override
    public void stop() {
        System.out.println("Pickup stop");
    }

    @Override
    public void addLoad() {
        System.out.println("Pickup add Load");
    }

    @Override
    public void removeLoad() {
        System.out.println("Pickup remove Load");
    }
    
}
