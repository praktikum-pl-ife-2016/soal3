import java.util.Scanner;
public class CetakanKue {
    
    public static int total;
    
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        Cetakan kue1 = new Cetakan();
        Cetakan kue2 = new Cetakan();
        
        kue1.setNama("Brownies");
        kue1.setJumlah(100);
        System.out.print("Nama kue : ");
        kue2.setNama(in.next());
        System.out.print("Jumlah : ");
        kue2.setJumlah(in.nextInt());
        total = kue1.getJumlah() + kue2.getJumlah();
        Cetakan.penjualan();
    }
}
