

import java.util.Scanner;

public class cetakanKue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        cetakan irma = new cetakan();
        irma.setJenisKue("brownies");
        irma.setJumlahKue(100);
        cetakan irma2 = new cetakan();
        irma2.setJenisKue("Onde-one");
        irma2.setJumlahKue(250);

        cetakan.penjualan(irma, irma2);

    }
}
