import java.util.Scanner;
public class Cetakan {
    
private String jenisKue;
private int jumlahKue;
private static int counter;

public Cetakan () {
    jenisKue ="Brownies";
    jumlahKue = 100;
    counter += jumlahKue;
    
}
public Cetakan (String jenisKue, int jumlahKue) {
    this.jenisKue = jenisKue;
    this.jumlahKue = jumlahKue;
    counter += jumlahKue;
    
}

public void setJumlahKue (int jumlahKue) {
    this.jumlahKue = jumlahKue;
}

public String getJenisKue (){
    return jenisKue;
}
public int getJumlahKue() {
    return jumlahKue;
}
void tampilan(Cetakan A) {
      
    System.out.println("Jumlah Penjualan " + jenisKue + "hari ini" + jumlahKue);
    System.out.println("Jumlah Penjualan "+ A.jenisKue + "hari ini " +A.jumlahKue);
    System.out.println("Jumlah total penjualan hari ini : " + counter);
    
}

    
    }

     


    

