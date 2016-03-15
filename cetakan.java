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
public class cetakan {
String namakue;
int jumlahkue;
cetakan(){
    namakue="brownies";
    jumlahkue=100;            
}
cetakan(String nama,int jumlah){
    namakue=nama;
    jumlahkue=jumlah;
}
public void setnama(String nama){
    namakue=nama;
}
public void setjumlah(int jumlah){
    jumlahkue=jumlah;
}
public String getnama(){
    return namakue;
}
public int getjumlah(){
    return jumlahkue;
}
public void cetak(){
    System.out.println("Jumlah penjualan "+namakue+" hari ini : "+jumlahkue );
}
public void penjualan(cetakan a){
    int jumlah =jumlahkue+a.jumlahkue;
    System.out.println("Jumlah total penjualan hari ini : "+jumlah);
}
}
