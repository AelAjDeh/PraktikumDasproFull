package P2;

import java.util.Scanner;

public class StudiKasusSatu05 {
    public static void main(String[] args) {

        Scanner Aell = new Scanner(System.in);

        int gaji_p, tun_anak, jum_anak, tot_tun;
        double potongan= 0.10, gajiBers, totalPot;
        
        System.out.println("Masukkan gaji pokok:");
        gaji_p = Aell.nextInt();

        System.out.println("Masukkan jumlah anak");
        jum_anak = Aell.nextInt();

        System.out.println("Mauskan tunjangan anak:");
        tun_anak = Aell.nextInt();

        totalPot = gaji_p*potongan;
        tot_tun = jum_anak*tun_anak;
        gajiBers = gaji_p+tot_tun-totalPot;

        System.out.println("Hasil akhir: "+ gajiBers);
    }
}
