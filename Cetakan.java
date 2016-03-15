public class Cetakan {
    String jenis;
    int jumlah;
    static int total;
    Cetakan(){
        this.jenis = jenis;
        this.jumlah = jumlah;
    }
    
    Cetakan(String jenis, int jumlah){
        this.jenis = jenis;
        this.jumlah = jumlah;
        total += jumlah;
    }
    
    void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    String getJenis(){
        return jenis;
    }
    
    int getJumlah(){
        return jumlah;
    }
    
    static int penjualan(){
        return total;
    }
}
