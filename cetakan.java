package latihan3;

/**
 *
 * @author JERRY
 */
public class cetakan {
  private String jenisKue;
  private int jumlahKue;
   static int jumlah;
  public cetakan(){
      jenisKue = "brownis";
      jumlahKue = 100;
      jumlah+=jumlahKue;
  }
  public cetakan(String p, int l){
      this.jenisKue = p;
      this.jumlahKue = l;
      jumlah+=l;
  }
  public void setJenis(String j) {
      this.jenisKue = j;
  }
  public void setJumlah (int k){
      this.jumlahKue = k;
  }
  public String getJenis (){
      return jenisKue;
  }
  public int getJumlahKue(){
      return jumlahKue;
  }
  public static int total(){
      
return jumlah;
}
public void displayMessage(){
    System.out.println("Jumlah Penjualan"+jenisKue+ "Hari Ini : "+jumlahKue);
System.out.println("jumlah total : "+total());}}