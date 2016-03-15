/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author efriza
 */
public class cetakankue {
    public static void main(String[] args) {
    cetakan ce1 = new cetakan();
    cetakan ce2 = new cetakan("Onde-onde",250);
    ce1.cetak();
    ce2.cetak();
    ce1.penjualan(ce2);
    }
    
}
