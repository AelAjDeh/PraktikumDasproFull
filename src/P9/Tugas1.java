package P9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        double totalPenj=0;
        int jmlTiket, hargaTiket = 50000, totalTiket = 0;

        System.out.println("Ketik '0' untuk menghentikan program");

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dieli");
            jmlTiket = ael.nextInt();

            if (jmlTiket==0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Nilai tidak valid");
                continue;
            }
            
            double hargaTotalAw = jmlTiket *hargaTiket;
            double diskon = 0;

            if (jmlTiket > 9) {
                diskon = 0.16;
            }else if(jmlTiket>5){
                diskon = 0.08;
            }

            double totBayar= hargaTotalAw - (hargaTotalAw * diskon);

            totalTiket+= jmlTiket;
            totalPenj+= totBayar;

            System.out.println("Mendapatkan diskon" +diskon);
            
            
        }
        System.out.println("Total tiket terjual:"+ totalTiket + "tiket");
            System.out.println("Total hasil penjualan: Rp"+ totalPenj);
    }
}
