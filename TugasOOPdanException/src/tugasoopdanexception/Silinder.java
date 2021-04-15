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
public class Silinder extends BangunRuang{
    int jari;
    int tinggi;

    public Silinder(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    @Override
    double luaspermukaan(){
        return 2*Math.PI*jari*(jari+tinggi);
    }
    
    @Override
    double volume(){
        return Math.PI*jari*jari*tinggi;
    }
    
}
