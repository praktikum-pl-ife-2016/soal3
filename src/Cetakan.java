public class Cetakan {
    private String jenis;
    private int jumlah;
    public static int total;
    
    public Cetakan(){
        jenis = "Brownies";
        jumlah = 100;
        total = 100;
    }
    public Cetakan(String jenis, int jumlah){
        this.jenis = jenis;
        this.jumlah = jumlah;
        total += jumlah;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public String getJenis(){
        return jenis;
    }
    public int getJumlah(){
        return jumlah;
    }
    public static int total(){
        return total;
    }
    public void penjualan(Cetakan cetakan){
        System.out.println("Jumlah Penjualan "+ jenis +" hari ini : "+ jumlah);
        System.out.println("Jumlah Penjualan "+ cetakan.jenis +" hari ini : "+ cetakan.jumlah);
        System.out.println("Jumlah total Penjualan hari ini : "+ total);
    }  
}
