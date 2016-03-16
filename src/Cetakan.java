public class Cetakan {
    
    String jenis;
    int jumlah; 
    static int total;
    
    public Cetakan (){
        this.jenis = "Brownies";
        this.jumlah = 100;
        this.total = 100;
        
    }
    
    public Cetakan (String a, int b){
        jenis = a;
        jumlah = b;
        total +=b;
    }
    
    public void setJenis(String a){
        this.jenis = a;
    }
    
    public void setJumlah(int b){
        this.jumlah = b;
    }
    
    public  String getJenis(){
        return jenis;
    }
   
    public  int getJumlah(){
        return jumlah;
    }
    public int total(){
        return total;
    }
    
    public void penjualan(Cetakan n){
        System.out.println("Jumlah penjualan " + jenis + " hari ini : " + jumlah );
        System.out.println("Jumlah penjualan " + n.jenis + " hari ini : " + n.jumlah );
        System.out.println("Jumlah total penjualan hari ini : " + total() );
    
    
}
    
}