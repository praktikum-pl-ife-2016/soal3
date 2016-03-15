
public class Cetakan {

    public static void main(String[] args) {
        
        CetakanKue jual = new CetakanKue();
        jual.penjualan();
        
        CetakanKue jual2 = new CetakanKue ("Onde-Onde", 250);
        jual2.penjualan();
        System.out.println("jumlah total penjualan hari ini : "+CetakanKue.total);
        
    }

}
