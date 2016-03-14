package cetakan;
public class Cetakan {
    public String jenis;
    public int jumlah;
    static int total;
    
    public Cetakan() {
        jenis = "brownies";
        jumlah = 100;
        total = 100;
    }
    public Cetakan(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        total += jumlah;
    }
    public void setter(String jenis) {
        this.jenis = jenis;
    }
    public void setter(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getter() {
        return jenis;
    }
    public void penjualan(Cetakan c) {
        System.out.println("Jumlah jualan "+jenis+" hari ini : "+jumlah);
        System.out.println("Jumlah jualan "+c.jenis+" hari ini : "+c.jumlah);
        System.out.println("Jumlah total penjualan hari ini : "+total);
    }
}
