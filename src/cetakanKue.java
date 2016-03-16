
import java.util.Scanner;
public class cetakanKue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            cetakan C1 = new cetakan();
            C1.setJenisKue("brownies");
            C1.setJumlahKue(100);

            cetakan C2 = new cetakan();
            C2.setJenisKue("Onde-onde");
            C2.setJumlahKue(250);

            cetakan.penjualan(C1, C2);
    }
}
