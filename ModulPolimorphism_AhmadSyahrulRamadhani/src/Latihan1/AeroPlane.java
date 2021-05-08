/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author user
 */
public class AeroPlane extends Vehicle {

    /*
     * @param args the command line arguments
     */
    @Override
    public void walk(){
        System.out.println("Aeroplane is Flying");
    }
    
    //override fuel method
    @Override
    public void fuel(){
        System.out.println("Aftur");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        AeroPlane garuda = new AeroPlane();
        garuda.function();
        garuda.fuel();
    }
    
}
