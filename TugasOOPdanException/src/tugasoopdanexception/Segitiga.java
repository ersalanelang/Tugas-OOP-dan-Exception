/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasoopdanexception;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{
    
      int alas, tinggi;
      double akar, alas3;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    double luas(){
        return (alas*tinggi)/2;
    }
    
    @Override
    double keliling(){    // segitiga sama kaki
        alas3 = alas/2;
        akar = Math.pow(alas3, 2) + Math.pow(tinggi, 2);
        
         return Math.sqrt(akar)*2 + alas;
    }
    
}
