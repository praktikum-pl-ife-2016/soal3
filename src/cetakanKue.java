package cetakan;

import static cetakan.Cetakan.counter;

public class cetakanKue {

    public static void main(String[] args) {// method main yang digunakan untuk memanggil method maupun constructor pada class Cetakan
        Cetakan c = new Cetakan();
        Cetakan a = new Cetakan("onde - onde", 250);
        Cetakan b = new Cetakan("pukis", 300);

        a.penjualan();
        b.penjualan();
        c.penjualan();
        a.tampil();
    }
}
