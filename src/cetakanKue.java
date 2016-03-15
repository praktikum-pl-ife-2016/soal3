
import java.util.Scanner;
public class cetakanKue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Masukkan jenis kue  : ");
        String jenisKue = in2.nextLine();
        System.out.print("Masukkan jumlah kue : ");
        int jumlahKue = in.nextInt();
        Cetakan kue = new Cetakan(jenisKue,jumlahKue);
        System.out.println("");
        System.out.print("Masukkan jenis kue  : ");
        String jenisKue1 = in2.nextLine();
        System.out.print("Masukkan jumlah kue : ");
        int jumlahKue1 = in.nextInt();
        Cetakan kue1 = new Cetakan(jenisKue1,jumlahKue1);
        System.out.println("");
        
        System.out.println("Jumlah penjualan "+ kue.getKue() +" hari ini : "+ kue.getJumlah());
        System.out.println("Jumlah penjualan "+ kue1.getKue()+ " hari ini : "+ kue1.getJumlah());
        System.out.println("Jumlah total penjualan hari ini : "+ Cetakan.penjualan());
        
    }
    
}
