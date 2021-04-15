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

public class Kubus extends BangunRuang{
    
    int sisi;
    
    public Kubus(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double luaspermukaan(){
        
        return (int) 6 * Math.pow(sisi, 2);
    }
    
    @Override
    double volume(){
        return Math.pow(sisi, 3);
    }
    
}
