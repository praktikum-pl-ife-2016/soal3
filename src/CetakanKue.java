

public class CetakanKue {

    public static void main(String[] args) {
      
        Cetakan kue0 = new Cetakan();
        Cetakan kue1 = new Cetakan("Onde-onde", 500);     
        kue0.getter(50);
        kue1.getter(250);
        kue0.display(kue0);
        kue1.display(kue1);
        System.out.println("Jumlah total penjualan hari ini : "+Cetakan.totalKue);
        
        
        
    }
    
}
