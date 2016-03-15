public class cetakanKue {
    public static void main(String[] args) {
    Cetakan a = new Cetakan();
    Cetakan b = new Cetakan("bolu",250);
    Cetakan c = new Cetakan("Pukis", 300);
    a.penjualan();
    b.penjualan();
    c.penjualan();
    c.cetak(); 
    }
}
