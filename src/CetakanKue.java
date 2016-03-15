
import java.util.Scanner;

public class CetakanKue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        cetakan kue = new cetakan();
        kue.setJeniskue("Brownies");
        kue.setJumlahkue(100);     
        cetakan kue2 = new cetakan();
        System.out.println("Masukan Jenis Kue : ");
        kue2.setJeniskue(scan.nextLine());
        System.out.println("Masukan Jumlah Kue : ");
        kue2.setJumlahkue(scan2.nextInt());
        kue.displaytotal();
        kue2.displaytotal();

        System.out.println("Jumlah total penjualan hari ini " + cetakan.total);
    }
}
