
public class CetakanKue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cetakan kue = new cetakan();
        cetakan kue2 = new cetakan("onde-onde", 250);

        kue.tampilan();
        kue2.tampilan();
        kue.penjualan();
    }

}
