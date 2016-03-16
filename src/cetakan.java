

public class cetakan {

    private String jenisKue;
    private int jmlKue;


    public cetakan() {
        jenisKue = "brownies";
        jmlKue = 100;
    }

    public cetakan(String j, int jml) {
        jenisKue = j;
        jmlKue = jml;
    }
    public void setJenisKue(String j) {
        jenisKue=j;
    }
    public void setJumlahKue(int j) {
        jmlKue=j;
    }

    public String getJenisKue(String j) {
        return jenisKue;
    }

    public int getJumlahKue() {
        return jmlKue;
    }

    public static void penjualan(cetakan C1, cetakan C2) {
        System.out.println("Jumlah penjualan "+C1.jenisKue+" hari ini : " +C1.jmlKue);
         System.out.println("Jumlah penjualan "+C2.jenisKue+" hari ini : " +C2.jmlKue);
         System.out.println("Jumlah total penjualan hari ini :  "+(C1.getJumlahKue()+C2.getJumlahKue()));
         
          

    }
}