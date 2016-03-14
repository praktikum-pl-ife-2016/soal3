/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetakan;

/**
 *
 * @author Rezananda
 */
public class Cetakan {
private String jenisKue;
private int jumlahKue;
private static int counter;
    public Cetakan(){
    this.jenisKue = "Brownis";
    this.jumlahKue = 100;
    this.counter = 100;
}
    public Cetakan(String jns, int jml){
        jenisKue = jns;
        jumlahKue = jml;
        counter += jml;
    }
    
    
    public void setJenisKue(String jns){
        this.jenisKue = jns;
        
    }
    public void setJumlahKue(int jml){
        this.jumlahKue = jml;
         
    }
    
    public String getJenisKue(){
        return jenisKue;
    }
    public int getJumlahKue(){
        return jumlahKue;
    }
    
    public static int total(){
        return counter;
        
    }
    
    public void penjualan(Cetakan n){
        System.out.println("Jumlah penjualan " + n.jenisKue + " adalah " + n.jumlahKue);
        System.out.println("Jumlah penjualan " + jenisKue+ " adalah " + jumlahKue);
        System.out.println("total penjualan hari ini adalah " + total());
        

    }
    
    
}
    

