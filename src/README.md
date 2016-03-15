src
===  
Masukkan file **.java** saja di folder ini, hapus pendefinisian package.
//Class declared
public class cetakan {
    String jeniskue, k;
    int jumlahkue, j;
    
    //initialize constructor 1
    public cetakan (){
    this.jeniskue = "brownies";
    this.jumlahkue = 100;
    
    }
    
    //initialize constructor #2
    public cetakan (String k, int j){
    this.jeniskue = k;
    this.jumlahkue = j;
    
    }
    
    //Exchage-value
   public void setjeniskue (String k){
   jeniskue = k;
   }         
    
   //Exchange-value
   public void setjumlahkue(int j){
   jumlahkue = j;
   }
   
   //Display message command
   public void displayMessage(cetakan a){
       System.out.println("Jumlah penjualan "+jeniskue+" hari ini\t:"+jumlahkue);
       System.out.println("Jumlah penjualan "+a.jeniskue+" hari ini\t:"+a.jumlahkue);
       System.out.println("Jumlah total penjualan hari ini\t\t:"+(a.jumlahkue+jumlahkue));
   }
}


public class cetakanKue {
    public static void main(String[] args) {
        //object created
        cetakan k1=new cetakan();
        cetakan k2 =new cetakan("Onde-onde",1000);
        
        //message displayed
        k1.displayMessage(k2);
        
        
        
    }
    
}
