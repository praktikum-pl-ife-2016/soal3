
public class Cetakan {
    String jenisKue;
    int jumlahKue;
    static int totalKue;
    
    //Konstruktor Default
    Cetakan(){
        jenisKue = "brownies";
        jumlahKue = 100;
    }
    //Konstruktor dengan parameter
    Cetakan(String jenisKue, int jumlahKue){
        this.jenisKue = jenisKue;
        this.jumlahKue = jumlahKue; 
        totalKue+=jumlahKue;
    }
    //Method jenis kue
    void setKue(String jenisKue){
        this.jenisKue = jenisKue;
    }
    //method jumlaj kue
    void setJumlah(int jumlahKue){
        this.jumlahKue = jumlahKue;
    }
    //method untuk mengetahui jenis kue
    String getKue(){
        return jenisKue;
    }
    //method untuk mengetahui jumlah kue
    int getJumlah(){
        return jumlahKue;
    }
    //method static mengembalikan nilai atau seluruh jumlah kue
    static int penjualan(){
        return totalKue;
    }
  
}
