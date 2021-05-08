/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class RectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rect rectangle1 = new Rect(2,3, 5,6);
        Rect rectangle2 = new Rect(1,1, 4, 4);
        
        //objek union dan intersection
        Rect intersection = rectangle2.intersection(rectangle1);
        Rect union = rectangle2.union(rectangle1);
        
        //membuat variable untuk memfromat string, biar mudah
        String koordinatKotak1 = String.format("[%d, %d ; %d,%d]", rectangle1.x1, rectangle1.y1, rectangle1.x2, rectangle1.y2);
        String koordinatKotak2 = String.format("[%d, %d ; %d,%d]", rectangle2.x1, rectangle2.y1, rectangle2.x2, rectangle2.y2);
        String koordinatUnion = String.format("[%d, %d ; %d,%d]", union.x1, union.y1, union.x2, union.y2);
        String koordinatIntersect = String.format("[%d, %d ; %d,%d]", intersection.x1, intersection.y1, intersection.x2, intersection.y2);
        
        System.out.println("<" + rectangle1.x2 +","+ rectangle1.y2 + ">" + " is inside the union");
        System.out.println(koordinatKotak2 + " union " + koordinatKotak1 + " = " + koordinatUnion );
        System.out.println(koordinatKotak2 + " union " + koordinatKotak1 + " = " + koordinatIntersect );
        
    }
    
}
