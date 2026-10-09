package P3;
import java.util.Scanner;

public class MenghitungTotalBayat05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.println("Masukkan harga");
        harga = ael.nextInt();

        potongan = diskon*harga;
        jml_bayar = harga-potongan;

        System.out.println("Jumlah yang harus anda bayar adalah" + jml_bayar);

        
    }
    
}
