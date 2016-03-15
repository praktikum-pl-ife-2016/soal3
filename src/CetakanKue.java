public class CetakanKue {
    
    private String jenis;
    private int jumlah;
    static int total;
    
    CetakanKue(){
        this.jenis = "brownies";
        this.jumlah = 100;
        total += jumlah;
    }
    
    CetakanKue (String  jen, int jum){
        this.jenis = jen;
        this.jumlah = jum;
        total += jumlah;
    }
    
    public void setJenis (String jen){
        this.jenis = jen;
    }
    
    public void setJumlah (int jum){
        this.jumlah = jum;
        total -= 100;
        total += jumlah;
    }
    
    public String getJenis (){
        return jenis;
    }
    
    public int getJumlah (){
        return jumlah;
    }
    
    public void penjualan(){
        System.out.println("jumlah total penjualan "+jenis+" hari ini "+jumlah);
    }
    
}
