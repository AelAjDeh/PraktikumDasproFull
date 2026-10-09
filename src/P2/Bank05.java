package P2;
import java.util.Scanner;


public class Bank05 {
    public static void main(String[] args) {
        Scanner Aell = new Scanner(System.in);
        
        int jml_tbgn_awl, lama_menabung;
        double prosen_bunga = 0.2, bunga, jml_tabungan_akhir;

        System.out.println("Masukan jumlah tabungan awal");
        jml_tbgn_awl = Aell.nextInt();

        System.out.println("Asukan lama anda menabung");
        lama_menabung = Aell.nextInt();

        bunga = lama_menabung*prosen_bunga*jml_tbgn_awl;
        jml_tabungan_akhir= bunga+jml_tbgn_awl;

        System.out.println("Bunga adalah: "+bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: "+jml_tabungan_akhir);

    }
}
