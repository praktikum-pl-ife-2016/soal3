
public class Cetakan {
    private String jenisKue;
    private int jmlKue = 0;
    private static int total = 0;
    
    public Cetakan(){
        
    }
    
    public Cetakan(String jns, int jml){
        jenisKue = jns;
        jmlKue = jml;
    }
    
    public void setJenisKue(String jns){
        jenisKue = jns;
    }
    
    public void setJumlahKue(int jml){
        jmlKue = jml;
        total += jml;
    }
    
    public String getJenisKue(){
        return jenisKue;
    }
    
    public int getJumlahKue(){
        return jmlKue;
    }
        
    public void penjualan(){
        System.out.println("Jumlah total penjualan hari ini : " + total);
    }    
}
