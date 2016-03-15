public class cetakan2 {
     private String jenisKue;
   private int jumlahKue;
   public static int total;
    
    public cetakan2(){
        jenisKue="brownies";
        jumlahKue=100;
		total+=jumlahKue;
    }
    public cetakan2( String jenisKue,int jumlahKue ){
        this.jenisKue=jenisKue;
        this.jumlahKue=jumlahKue;
		total+=jumlahKue;
    }
    public void setJenisKue(String jenisKue){
        this.jenisKue=jenisKue;
    }
    public void setJumlahKue(int jumlahKue){
        this.jumlahKue=jumlahKue;
        
    }
    public String getJenisKue(){
        return jenisKue;
    }
    public int getJumlahKue(){
        return jumlahKue;
    }
    
    public void penjualan(){
        System.out.println("Jumlah Penjualan "+jenisKue+" Hari ini:"+ jumlahKue );
        
    }
}
