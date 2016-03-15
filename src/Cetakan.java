
package cetakan;

public class Cetakan {
    
    private static int jumlahKue;
    private static String jenisKue;
   public static int total;
    
    Cetakan(){
       jumlahKue = 100;
       jenisKue = "brownies";
       total = total + jumlahKue;              
   }
   
   Cetakan (int x,String y){
       jumlahKue = x;
       jenisKue = y;
       total = total + jumlahKue;
   }
   
   public void setJumlahKue(int x){
       jumlahKue = x;
       total -= 100;
       total += jumlahKue;
   }
   
   public void setJenisKue(String y){
       
   }
   public static int getJumlahKue (){
       return jumlahKue; 
   }
   public static String getJenisKue(){
       return jenisKue;
   }    
   public void penjualan(){
       System.out.println("Jumlah penjualan " + jenisKue + "hari ini: " + jumlahKue);
   }
}
