public class Cetakan {

    private String jenisKue;
    private int jumlahKue;
    static int total;
    
    
    public Cetakan() {
        jenisKue = "brownies";
        jumlahKue = 100;
        total = 100;
    }
    
    public Cetakan(String jenisKue, int jumlahKue) {
        this.jenisKue = jenisKue;
        this.jumlahKue = jumlahKue;
        total += jumlahKue;
    }
    
    public void setJenisKue(String jenisKue) {
        this.jenisKue = jenisKue;
    }
    
    public void setJumlahKue(int jumlahKue) {
        this.jumlahKue = jumlahKue;
    }
    
    public String getJenisKue() {
        return jenisKue;
    }
    
    public int getJumlahKue() {
        return jumlahKue;
    }
    
    public static int totalKue() {
        return total;
    }
    
    public void penjualan(Cetakan kue) {
        System.out.println("Jumlah penjualan "+jenisKue+" hari ini : "+jumlahKue);
        System.out.println("Jumlah penjualan "+kue.jenisKue+" hari ini : "+kue.jumlahKue);
        System.out.println("Jumlah total penjualan hari ini : "+total);
    }
    
}
