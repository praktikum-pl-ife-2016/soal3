
public class cetakan {

    private String jenisKue;
    private int jumlahKue;
    private static int counter;
// constructor
    cetakan() {
        jenisKue = "brownies";
        jumlahKue = 100;
        counter += jumlahKue;
    }
// constructor 2
    cetakan(String jenisKue, int jumlahKue) {
        this.jenisKue = jenisKue;
        this.jumlahKue = jumlahKue;
        counter += jumlahKue;
    }

    public void setJenis(String jenisKue) {
        this.jenisKue = jenisKue;
    }

    public void setJumlah(int jumlahKue) {
        this.jumlahKue = jumlahKue;
    }

    public String getJenis() {
        return jenisKue;
    }

    public int getJumlah() {
        return jumlahKue;
    }
// menampilkan total penjualan
    public void penjualan() {
        System.out.println("Jumlah total penjualan hari ini : " + counter);
    }

    public void tampilan() {
        System.out.println("Jumlah penjualan " + jenisKue + " hari ini : " + jumlahKue);
    }
}
