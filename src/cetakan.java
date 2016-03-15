
public class cetakan {
    
    cetakan (){
        jenis = "brownies";
        jumlah = 100;
        total = jumlah;
    }
    private String jenis;
    private int jumlah;
    public static int total;
    
    public cetakan (String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        total += jumlah;
    }
    
    public void setJenis (String j) {
        this.jenis = j;
    }
    public String getJenis (String a) {
      return a;
        }
    public void setJumlah (int jml) {
        this.jumlah = jml;
    }
    public int getJumlah (int jml) {
        return jml;
    }        
    public void penjualan(){
        System.out.println("Jumlah penjualan " + (jenis) + " hari ini : " + (jumlah));
    }
}