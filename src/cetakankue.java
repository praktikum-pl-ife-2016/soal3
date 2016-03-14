/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;


/**
 *
 * @author praktikum
 */
public class cetakankue {
    public static void main(String[] args) {
        Cetakan kue1 = new Cetakan();
        Cetakan kue2 = new Cetakan("sempol",200);
        kue1.penjualan();
        kue2.penjualan();
        kue2.setJumlahkue(600);
        System.out.println("Total penjualan kue hari ini "+Cetakan.jumlahtotal);
    }
    
}
