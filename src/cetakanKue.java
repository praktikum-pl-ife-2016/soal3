
import java.util.Scanner;

public class cetakanKue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        cetakan kue1 = new cetakan();
        cetakan kue2 = new cetakan("Onde-onde", 250);
        System.out.println("==================BAKERY==================");
        System.out.print("Masukkan jenis kue yang diinginkan : ");
        kue1.setJen(in.next());
        System.out.print("\nMasukkan jumlah kue yang diinginkan : ");
        kue1.setJum(in.nextInt());
        System.out.println("\nApakah anda ingin memastikan pesanan anda ?");
        String pil = in.next();
        if (pil.equalsIgnoreCase("Ya")) {
            System.out.println("\n=========================================");
            System.out.println("Pesanan anda "+kue1.getJen());
            System.out.print(kue1.getJum()+" buah");
            System.out.println("\nPesanan anda "+kue2.getJen());
            System.out.print(kue2.getJum()+" buah");
        } else {
            System.out.println("Terima kasih.");
        }
        cetakan.penjualan(kue1, kue2);
    }
}
