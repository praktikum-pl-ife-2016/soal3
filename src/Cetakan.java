/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

public class Cetakan {
    public String jeniskue;
    public int jumlahkue;
    public static int jumlahtotal;
    Cetakan() {
    jeniskue= "brownies";
    jumlahkue =100;
    jumlahtotal+=jumlahkue;
}
    Cetakan(String jeniskue, int jumlahkue){
     this.jeniskue=jeniskue;
     this.jumlahkue=jumlahkue;
     jumlahtotal+=jumlahkue;
    }
    void setJeniskue(String jeniskue){
        this.jeniskue=jeniskue;
    }
    void setJumlahkue(int jumlahkue){
        this.jumlahkue=jumlahkue;
    }
    String getJeniskue(){
        return this.jeniskue;
    }
    int getJumlahkue(){
        return this.jumlahkue;
    }
    void penjualan(){
        System.out.println("Jumlah penjualan "+getJeniskue()+" hari ini "+getJumlahkue());;
        
    }
    
}
