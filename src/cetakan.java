
public class cetakan {
    public String jenis;
    public int jumlah;
    
    public cetakan(){
        jenis = "brownies";
        jumlah = 100;
    }
    
    public cetakan(String jen, int jum) {
        this.jenis = jen;
        this.jumlah = jum;
    }
    
    public void setJen(String j) {
        jenis = j;
    }
    
    public void setJum(int j) {
        jumlah   = j;
    }
    
    public String getJen(){
        return jenis;
    }
    
    public int getJum(){
        return jumlah;
    }
    
    public static void penjualan(cetakan k1, cetakan k2) {
        System.out.println("\n=========================================");
        System.out.println("Jumlah penjualan "+k1.jenis+" hari ini : "+k1.jumlah);
        System.out.println("Jumlah penjualan "+k2.jenis+" hari ini : "+k2.jumlah);
        System.out.println("Jumlah total penjualan hari ini : "+(k1.jumlah+k2.jumlah));
    }
}
