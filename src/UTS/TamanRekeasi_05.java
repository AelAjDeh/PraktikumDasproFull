package UTS;

import java.util.Scanner;

public class TamanRekeasi_05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int tReguler = 45000, tTerusan = 70000, tPelajar = 35000;
        int totHarga, totBayar;


        System.out.println("Masukkan jumlah anda membeli tiket");
        int jml = ael.nextInt();
        System.out.println("apakah memnber atau bukan true/false");
        boolean member = ael.nextBoolean();

        

        System.out.println("Masukkan kode tiket");
        int kode = ael.nextInt();
        
            totHarga = kode * jml;

        switch (kode) {
            case 1:
                System.out.println("Reguler");
                tReguler = 45000;

                break;
            case 2:
                System.out.println("Terusan");
                tTerusan = 70000;
                break;
            case 3:
                tPelajar = 35000;
                break;
            default:
                System.out.println("Kode tidak valid");
                break;
        }

        if (member) {
            
            totBayar = totHarga * 5/100;
        } else {
            
        }

        System.out.println("kode tiket" +kode);

    }
}

// T2 = 15 20%
// T1 = 6 10%
// Reg = 45k
// ter = 70k
// pel = 35k
