/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author user
 */
public class PembayaranGaji {

    /**
     * @param args the command line arguments
     */
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur){
            uang += ((Direktur)peg).tunjangan();
        }
        if(peg instanceof Staf){
            uang+=((Staf)peg).Bonus();
        }
        return uang;
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PembayaranGaji pg = new PembayaranGaji();
        Staf aan = new Staf();
        Direktur andi = new Direktur();
        
        System.out.println("Gaji yang dibayarkan untuk staf : " + pg.hitungGaji(aan));
        System.out.println("Gaji yang dibayarkan kepada Direktur : " + pg.hitungGaji(andi));
       
    }
    
}
