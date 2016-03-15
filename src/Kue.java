import java.util.Scanner;
public class Kue {
    
private String jenisKue;
private int jumlahKue;
private static int counter;

public Kue () {
    jenisKue ="Brownies";
    jumlahKue = 100;
    counter += jumlahKue;   
}
public Kue (String jenisKue, int jumlahKue) {
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
void tampilan(Kue k) {
    System.out.println("Jumlah Penjualan " + jenisKue + " hari ini\t: " + jumlahKue);
    System.out.println("Jumlah Penjualan "+ k.jenisKue + " hari ini\t: " +k.jumlahKue);
    System.out.println("Jumlah total penjualan hari ini\t\t: " + counter);
    
}

    
    }

     
    

