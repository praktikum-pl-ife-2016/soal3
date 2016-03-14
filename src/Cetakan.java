public class Cetakan {
    String kue ;
    int jumlah ;
    static int counter;
    public Cetakan(){
        this.kue = "brownies";
        this.jumlah = 100;
        counter+= jumlah;
    }
    public  Cetakan(String kue, int jumlah){
        this.kue = kue;
        this.jumlah = jumlah;
        counter+= jumlah;
    }
    public void setJenisKue(String kue){
        this.kue = kue;
    }
    public String getJenisKue(){
        return kue;
    }
    public void setJumlahKue(int kue){
        this.jumlah = jumlah;
    }
    public int getJumlahKue(){
        return jumlah;
    }
    public static int jumlahTotal(){
        return counter; 
    }
    public void penjualan(Cetakan c){
        System.out.println("Jumlah penjualan "+kue+" hari ini \t: "+jumlah);
        System.out.println("Jumlah penjualan "+c.kue+" hari ini \t: "+c.jumlah);
        System.out.println("JUmlah total penjualan hari ini \t: "+jumlahTotal());       
    }   
}