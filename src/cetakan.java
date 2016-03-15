public class Cetakan {
private String jenis;
private int jumlah;
static int counter;
  public Cetakan(String jenis, int jumlah){
      this.jenis = jenis;
      this.jumlah = jumlah;
      counter += jumlah;
  }
  public Cetakan(){
  this.jenis = "brownies";
  this.jumlah = 100;
  counter += jumlah;
  }

  public void setter(String jenis){
      this.jenis = jenis;
  }
  public void setter(int jumlah){
      this.jumlah = jumlah; 
  }
  public String getter(){
   return jenis;
  }
  public int getterjumlah(){
   return jumlah;
  }
  public void penjualan(){
      System.out.println("Penjualan "+jenis+ " hari ini : "+ jumlah);
      
  }
  public void cetak(){
  System.out.println("Jumlah total penjualan hari ini :"+ total());
  }
  public static int total(){
      return counter;
  }
  
}