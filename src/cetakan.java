package cetakankue;

public class cetakan {

    static String jenisKue;
    static int jumlahKue;
    static int total;


    public cetakan() {
        this.jenisKue = "brownies";
        this.jumlahKue = 250;
        total+= jumlahKue;
    }

    public cetakan(String a, int b) {
        this.jenisKue = a;
        this.jumlahKue = b;
        total+= jumlahKue;
    }

    public void setJenisKue(String a) {
        this.jenisKue = a;
    }

    public void setJumlahKue(int a) {
        this.jumlahKue  = a;       
    }

    public String getJenisKue() {
        return jenisKue;
    }

    public int getJumlahKue() {
        return jumlahKue;
    }
    
    public void penjualan(){
        System.out.println("Jumlah penjualan "+jenisKue+" hari ini : "+jumlahKue);
    }
}
