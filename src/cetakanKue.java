
package cetakan;

public class cetakanKue {
    public static void main (String[] args){
        Cetakan objc = new Cetakan();
        
        objc.penjualan();
        Cetakan objc2 = new Cetakan(100,"Onde");
        objc.setJumlahKue(500);
        objc2.penjualan();
        System.out.println("Jumlah total penjualan hari ini : " + Cetakan.total);
        
    }
}
