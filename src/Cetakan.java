public class Cetakan {
    public int jumlah;
    public String nama;

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
        System.out.println("Jumlah penjualan " + getNama() + " hari ini : " + getJumlah());
    }
    public static void penjualan(){
        System.out.println("Jumlah total penjualan hari ini : " + CetakanKue.total);
    }
}
