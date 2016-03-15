public class cetakan {
    private String jenisKue;
    private static int total;
    public int jumlahKue;
    
    cetakan(){
        jenisKue = "Brownies";
        jumlahKue =100;
        total =100;
    }
    cetakan(String x,int y){
        jenisKue = x;
        jumlahKue = y;
        total +=y;
        
    }public void setjumlahKue(int y){
        jumlahKue =y;
    }public void setjenisKue(String x){
        jenisKue =x;
    }
    
    public void tampilan(cetakan a){
        System.out.println("Jumlah Penjualan "+ jenisKue+" hari ini :"+jumlahKue);
        System.out.println("Jumlah penjualan "+a.jenisKue+" hari ini :"+a.jumlahKue);
        System.out.println("Jumlah penjualan hari ini : "+total);
    }
}
