public class Cetakan {

    String jenisKue;
    int jumlahKue;
    int terjual = 0;
    static int totalKue;

    public Cetakan() {
        jenisKue = "brownies";
        jumlahKue = 100;
       
    }

    public Cetakan(String a, int b) {
        jenisKue = a;
        jumlahKue = b;
       
    }

    public void setter(String nama, int jumlah) {
        jenisKue = nama;
        jumlahKue = jumlah;

    }

    public void getter(int get) {

        terjual = get;
        totalKue+=terjual;
    }

    public static void penjualan(Cetakan B, Cetakan C) {
        totalKue = B.terjual + C.terjual;
        System.out.println("Jumlah total penjualan hari ini : " + totalKue);

    }
    

    public void display(Cetakan A) {
        System.out.println("Jumlah "+jenisKue+" hari ini : "+jumlahKue);
        System.out.println("Jumlah yang terjual : " + A.terjual);

    }

}
