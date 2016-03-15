
public class cetakan {

    String jenis;
    int jumlah;
    static int total;

    public cetakan() {
        this.jenis = "brownies";
        this.jumlah = 100;
    }

    public cetakan(String a, int b) {
        this.jenis = " ";
        this.jumlah = 0;
    }

    public void setJeniskue(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlahkue(int jumlah) {
        this.jumlah = jumlah;
        total += jumlah;
    }

    public String getJeniskue() {
        return jenis;
    }

    public int getJumlahkue() {
        return jumlah;
    }

    public void penjualan() {

    }

    public void displaytotal() {
        System.out.println("Jumlah penjualan " + getJeniskue() + " hari ini " + getJumlahkue());
    }

}
