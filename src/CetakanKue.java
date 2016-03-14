import java.util.Scanner;
public class CetakanKue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Cetakan c = new Cetakan("brownies", 100);
        Cetakan kue[] = new Cetakan[2];
        int i = 0;
        
        while(i < kue.length){
        kue[i] = new Cetakan();
        
        System.out.print("Masukkan jenis kue : ");
        kue[i].setJenisKue(in.next());
        System.out.print("Masukkan jumlah kue : ");
        kue[i].setJumlahKue(in.nextInt());
        
        i++;
        }
        
        for(int j = 0; j < i; j++){
            System.out.println("Jumlah penjualan "+ kue[j].getJenisKue() +" hari ini : " + kue[j].getJumlahKue());
        }
        c.penjualan();
    }
}
