import java.util.Scanner;

public class cetakanKue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Masukkan jenis kue : ");
        String jenis = in2.nextLine();
        System.out.print("Masukkan jumlah kue : ");
        int jumlah = in.nextInt();
        Cetakan a = new Cetakan(jenis, jumlah);
        
        System.out.print("Masukkan jenis kue : ");
        String jenis2 = in2.nextLine();
        System.out.print("Masukkan jumlah kue : ");
        int jumlah2 = in.nextInt();
        System.out.println("");
        Cetakan b = new Cetakan(jenis2, jumlah2);
        
        System.out.println("Jumlah penjualan "+a.getJenis()+" hari ini : "+a.getJumlah());
        System.out.println("Jumlah penjualan "+b.getJenis()+" hari ini : "+b.getJumlah());
        System.out.println("Total penjumlahan hari ini : "+Cetakan.total);
    }
}
