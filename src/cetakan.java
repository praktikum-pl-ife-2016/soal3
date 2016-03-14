public class cetakan {
    public static int cetakan ;
    private String jenisKue;
    private int jumlahKue;
    private static int penjualan;
public cetakan (){
    jenisKue = "brownis";
    jumlahKue = 100;
    penjualan+=jumlahKue;
}
public cetakan (String j, int jum){
    jenisKue = j;
    jumlahKue = jum;
    penjualan+=jumlahKue;
}
public void setJenisKue (String j){
    jenisKue =j;
}
public void setJumlahKue(int jum){
    jumlahKue = jum; 
}
public void display(cetakan c){
    System.out.println("Jumlah Penjualan "+jenisKue+" adalah "+jumlahKue);
    System.out.println("Jumlah Penjualan "+c.jenisKue+" adalah "+c.jumlahKue);
    System.out.println("jumlah total penjualan "+penjualan);
} 
}
