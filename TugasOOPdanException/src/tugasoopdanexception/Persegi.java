/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasoopdanexception;

import java.lang.Math;
/**
 *
 * @author ASUS
 */
public class Persegi extends BangunDatar {
    
    int sisi;
    double c;
    
    public Persegi(int sisi) {
        this.sisi = sisi;
        this.c = c;
    }
    
    @Override
    double luas(){
        return sisi*sisi;
    }
    
    @Override
    double keliling(){
        return 4*sisi;
    }
}
