/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 8.1
 */
public class CetakanKue {
    public static void main(String[] args) {
        
        Cetakan kue1 = new Cetakan();
        kue1.penjualan();
        
        Cetakan kue2 = new Cetakan("bolu", 200);
        kue2.penjualan();
        
        Cetakan kue3 = new Cetakan ("Onde", 200);
        kue3.penjualan();
        
        Cetakan kue4 = new Cetakan();
        kue4.setJumlah(10);
        kue4.penjualan();
        
        
        System.out.println("Jumlah penjualan " + Cetakan.total);
    }
}
