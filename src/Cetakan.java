
public class Cetakan {

    public String jenis;
    public int jumlah;

    public Cetakan() {
        jenis = "brownies";
        jumlah = 100;
    }

    public Cetakan(String jen, int jum) {
        this.jenis = jen;
        this.jumlah = jum;
    }

    public void setJenis(String j) {
        jenis = j;
    }

    public void setJumlah(int j) {
        jumlah = j;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public static void penjualan(Cetakan c1, Cetakan c2) {
        System.out.println("Jumlah penjualan " + c1.getJenis() + " hari ini : " + c1.getJumlah());
        System.out.println("Jumlah penjualan " + c2.getJenis() + " hari ini : " + c2.getJumlah());
        System.out.println("Jumlah total penjualan hari ini : " + (c1.getJumlah() + c2.getJumlah()));
    }
}
