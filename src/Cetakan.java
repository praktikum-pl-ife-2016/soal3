/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 8.1
 */
public class Cetakan {

    String jenis;
    int jumlah;
    public static int total;

    Cetakan() {

        this.jenis = "brownies";
        this.jumlah = 100;
        total += jumlah;

    }

    Cetakan(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        total += jumlah;
    }

    public void setJenis(String j) {
        this.jenis = j;
    }

    public void setJumlah(int jml) {
        this.jumlah = jml;
        total -= 100;
        total += jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void penjualan() {
        System.out.println("Jumlah penjualan " + jenis + " hari ini : " + jumlah);
    }

}
