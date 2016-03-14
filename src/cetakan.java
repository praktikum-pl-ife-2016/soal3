
package cetakankue;

public class cetakan {
    private  String jenis;
    private  int jumlahKue;
    public static int counter;
    
    public cetakan(String nama,int jml){
        this.jenis=nama;
        this.jumlahKue=jml;
        counter +=jumlahKue;
    }
    public cetakan (){
        jenis="brownies";
        jumlahKue=100;
        counter +=jumlahKue;
    }
    public void setJenis(String a){
        this.jenis=a;
        
    }
    public void setJumlahKue(int a){
       jumlahKue=a; 
    }
    public String getJenis(){
        return jenis;
    }
    public int getJumlah(){
        return jumlahKue;
    }
//    public static void penjualan(int t,int a){
//     int total=0;
//     total=t+a;
//        System.out.println("jumlah total penjualan hari ini :"+total);
//     
//        
//        
//    }
    public void diplayMassege (cetakan a){
        System.out.println("Jumlah Penjualan "+jenis+" hari ini :"+jumlahKue);
        System.out.println("Jumlah Penjualan "+a.jenis+"hari ini :"+a.jumlahKue);
        System.out.println("jumlah penuialan total hari ini :"+counter);
    }
    
}
