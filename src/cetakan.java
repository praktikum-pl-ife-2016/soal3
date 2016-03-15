

public class cetakan {

    private String jenisKue;
    private int jmlKue;

    public cetakan() {
        jenisKue = "brownies";
        jmlKue = 100;
    }

    public cetakan(String jns, int jml) {
        jenisKue = jns;
        jmlKue = jml;
    }

    public void setJenisKue(String j) {
        jenisKue = j;

    }

    public void setJumlahKue(int k) {
        jmlKue = k;
    }

    public String getJenisKue() {
        return jenisKue;
    }

    public int getJumlahKue() {
        return jmlKue;
    }

    public static void penjualan(cetakan k1, cetakan k2) {
        System.out.println("Jumlah penjualan " + k1.getJenisKue() + " hari ini : " + k1.getJumlahKue());
        System.out.println("Jumlah penjualan " + k2.getJenisKue() + " hari ini : " + k2.getJumlahKue());
        System.out.println("Jumlah total penjualan hari ini : " + (k1.getJumlahKue() + k2.getJumlahKue()));
    }
}
