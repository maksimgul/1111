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
public class JavaApplication70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Sedan sed = new Sedan();
        Sedan sed2 = new Sedan(3,10);
        
        sed2.addPassenger(5);
        sed.addPassenger(10);
        
        boolean a = sed instanceof ICar;
        boolean b = sed2 instanceof PassengerCar;
        boolean c = sed2 instanceof Truck;
       
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
