/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author user
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Rectangle("red", 4, 5); //membuat objek rectangle dengan referensi Shape
        System.out.println(s1); // (compiler writes here s1.toString()) memanggil method toString yang sudah di overide 
        System.out.println("Area is " + s1.getArea()); // memanggil dan menampilkan method getArea 
        
        Shape s2 = new Triangle("blue", 4, 5);//membuat objek triangle dengan referensi Shape
        System.out.println(s2);// (compiler writes here s2.toString()) memanggil method toString yang sudah di overide 
        System.out.println("Area is " + s2.getArea());// memanggil dan menampilkan method getArea 
    }
    
}
