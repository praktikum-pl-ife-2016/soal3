public class Cetakan {
private String namaKue;
private int banyakKue;
private static int banyak;

public Cetakan (){
    namaKue="brownies";
    banyakKue=100;
    banyak+=banyakKue;
    
    }
    
public Cetakan (String b,int n){
    this.namaKue=b;
    this.banyakKue=n;
    banyak+=banyakKue;
}

public void setNama(String p){
    this.namaKue=p;
    
}

public void setBanyak (int k){
    this.banyakKue=k;
    banyak-=100;
    banyak+=banyakKue;
}

public String getNama (){
    return namaKue;
}

public int getBanyak(){
    return banyakKue;
    
}

public static int jumlah (){
    return banyak;
    
   
}
public void displayMessage(){
    System.out.println("Jumlah Penjualan " + namaKue + " Hari Ini : " + banyakKue );
    
    
}

}   
