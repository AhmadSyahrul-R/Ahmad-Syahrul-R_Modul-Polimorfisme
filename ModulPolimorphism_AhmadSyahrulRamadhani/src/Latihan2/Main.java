/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //https://www.geogebra.org/m/VqHK8xnd
        //create Line Object
        Line a = new Line(1, -3, 5, 5);
        Line b = new Line(6, 6, -1, 3);
        
        System.out.println("Panjang garis a : " + a.getLength());
        System.out.println("Panjang garis b : " + b.getLength());
        
        if(b.isGreater(a, b)){
            System.out.println("garis b lebih panjang dari a");
        }else if(b.isLess(a, b)){
            System.out.println("garis b lebih pendek dari a");
        }else if(b.isEquals(a, b)){
            System.out.println("garis b sama panjang dengan a");
        }
    }
    
}
