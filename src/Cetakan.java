package cetakan;

public class Cetakan {

    String kue;
    int jumlahKue, total;
    static int counter;

    public Cetakan(String kue, int jumlahKue) {
        this.kue = kue;
        this.jumlahKue = jumlahKue;
        counter += jumlahKue;
    }

    public Cetakan() {
        this.kue = "brownies";
        this.jumlahKue = 100;
        counter += jumlahKue;
    }

    public void setter(String kue) {// method untuk set nama kue

        this.kue = kue;

    }

    public void setter(int jumlahKue) {// method untuk set jumlah kue
        this.jumlahKue = jumlahKue;

    }

    public String getter() {// method untuk mengembalikan nama kue
        return kue;
    }

    public int getterJumlahKue() {// method untuk mengembalikan jumlah kue
        return jumlahKue;

    }

    public void penjualan() {// method untuk print nama dan jumlah kue yang dijual
        System.out.println("Jumlah Penjualan " + kue + " hari ini : " + jumlahKue);

    }

    public void tampil() {// method untuk menampilkan jumlah kue keseluruhan

        System.out.println("Jumlah total penjualan hari ini  : " + total());

    }

    public static int total() {// method untuk mengembalikan nilai counter yang mana menyimpan total penjualan kue

        return counter;
    }

}
