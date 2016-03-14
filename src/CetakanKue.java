package cetakankue;

public class CetakanKue {

    public static void main(String[] args) {
        cetakan kue1 = new cetakan();
        kue1.penjualan();
        cetakan kue2 = new cetakan("onde onde" , 350);
        kue2.penjualan();
        System.out.println("Jumlah total penjualan hari ini : "+cetakan.total);
    }
    
}
