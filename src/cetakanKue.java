
import java.util.Scanner;

public class cetakanKue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cetakan c1 = new Cetakan();
        System.out.print("Masukkan jenis kue yang ingin dipesan : ");
        String jenis = in.nextLine();
        c1.setJenis(jenis);
        System.out.print("Masukkan jumlah kue yang ingin dipesan : ");
        int jumlah = in.nextInt();
        c1.setJumlah(jumlah);
        Cetakan c2 = new Cetakan("Onde-onde", 250);
        Cetakan.penjualan(c1, c2);
    }
}
