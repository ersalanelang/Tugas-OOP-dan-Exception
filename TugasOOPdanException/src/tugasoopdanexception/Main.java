/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasoopdanexception;

import java.util.Scanner;
import java.util.*;


/**
 *
 * @author ASUS      
 */                   // Tidak Menggunakan Inheretance
public class Main {   // Menggunakan Override dan Overloading
                      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilih = 0, sisi2=0, jari2=0, panjang2=0, lebar2=0, alas2=0, tinggi2=0, x=0;
        String y_n; 
        
        do{
            System.out.println("Menu"); 
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Kubus");
            System.out.println("6. Balok");
            System.out.println("7. Silinder");
            System.out.println("0. Sudahi Saja");
            
            try{
                System.out.print(" Pilih : ");
                pilih = input.nextInt();
            }
           
            catch(InputMismatchException error){
                System.out.println(error.getMessage() + " Error : Masukan Angka");
            }
            
            switch(pilih){
                case 1:
                    try{
                        System.out.print(" Masukan Sisi : ");
                        sisi2 = input.nextInt();
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunDatar persegi = new Persegi(sisi2);
                            System.out.println(" Keliling Persegi = " + persegi.keliling());
                            System.out.println(" Luas Persegi = " + persegi.luas());
                        }
                    }
                   break;
                   
                case 2:
                    try{
                        System.out.print(" Masukan Jari-jari : ");
                        jari2 = input.nextInt();
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunDatar lingkaran = new Lingkaran(jari2);
                            System.out.println(" Luas Lingkaran = " + lingkaran.keliling());
                            System.out.println(" Keliling Lingkaran = " + lingkaran.luas());
                        }
                    }
                   break;
                   
                case 3:
                    try{
                        System.out.print(" Masukan Panjang : ");
                        panjang2 = input.nextInt();
                        System.out.print(" Masukan Lebar : ");
                        lebar2 = input.nextInt();
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunDatar persegiPanjang = new PersegiPanjang(panjang2,lebar2);
                            System.out.println(" Keliling Persegi Panjang = " + persegiPanjang.keliling());
                            System.out.println(" Luas Persegi Panjang = " + persegiPanjang.luas());
                        }
                    }
                   break;
                   
                case 4:
                    try{
                        System.out.print(" Masukan Alas : ");
                        alas2 = input.nextInt();
                        System.out.print(" Masukan Tinggi : ");
                        tinggi2 = input.nextInt();
                        
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunDatar segitiga = new Segitiga(alas2, tinggi2);
                            System.out.println(" Keliling Segitiga = " + segitiga.keliling());
                            System.out.println(" Luas Segitiga = " + segitiga.luas());
                        }
                    }
                   break;
                   
                case 5:
                    try{
                        System.out.print(" Masukan Sisi : ");
                        sisi2 = input.nextInt();
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunRuang kubus = new Kubus(sisi2);
                            System.out.println(" Luas Permukaan Kubus = " + kubus.luaspermukaan());
                            System.out.println(" Volume Kubus = " + kubus.volume());
                        }
                    }
                   break; 
                   
                case 6:
                    try{
                        System.out.print(" Masukan Panjang : ");
                        panjang2 = input.nextInt();
                        System.out.print(" Masukan Lebar : ");
                        lebar2 = input.nextInt();
                        System.out.print(" Masukan Tinggi : ");
                        tinggi2 = input.nextInt();
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunRuang balok = new Balok(panjang2, lebar2, tinggi2);
                            System.out.println(" Luas Permukaan Balok = " + balok.luaspermukaan());
                            System.out.println(" Volume Balok = " + balok.volume());
                        }
                    }
                   break;
                   
                case 7:
                    try{
                        System.out.print(" Masukan Jari jari : ");
                        jari2 = input.nextInt();
                        System.out.print(" Masukan Tinggi : ");
                        tinggi2 = input.nextInt();
                    }
                    catch(InputMismatchException error){
                        System.out.println(error.getMessage() + " Error : Masukan Angka");
                        x=1;
                    }
                    finally{
                        if(!(x==1)){
                            BangunRuang silinder = new Silinder(jari2, tinggi2);
                            System.out.println(" Luas Permukaan Balok = " + silinder.luaspermukaan());
                            System.out.println(" Volume Balok = " + silinder.volume());
                        }
                    }
                   break;
                   
                case 0:
                    System.exit(0);
                    break;
                  
                default :    
            }System.out.print(" Mau lagi ?? (y/n) ");
            y_n = input.next();
        }while(y_n.equals("y"));
    }
}
