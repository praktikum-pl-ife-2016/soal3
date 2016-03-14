
public class Cetakan {
    private static String jenisKue;
    private  static int jumlahKue;
     static int hitung;
    
    public Cetakan(){
        this.jenisKue = "Brownies";
        this.jumlahKue = 100;
        hitung+=jumlahKue;
    }
    public Cetakan (String jenisKue ,int jumlahKue){
        this.jenisKue = jenisKue;
        this.jumlahKue = jumlahKue;
        hitung+=jumlahKue;
    }
    public void setJenis(String jenisKue){
        this.jenisKue = "Onde-onde";
    }
    public void setJumlah (int jumlahKue){
        this.jumlahKue = 250;
        hitung+=jumlahKue;
        
    }
    public String getJenis(){
        return jenisKue;
    }
    public int getJumlah (){
        return jumlahKue;
    }
    public void Penjualan(){
        System.out.println("Jumlah penjualan "+jenisKue+" hari ini "+jumlahKue);
    }
}
