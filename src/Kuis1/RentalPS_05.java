package Kuis1;

import java.util.Scanner;

public class RentalPS_05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int jam_Penuh = 7000;
        int sisa_Menit = 150;
        int lama_bermain;
        double total_biaya, potongan, biaya_member;
        double diskon = 12.5;

        System.out.print("Masukkan lama bermain (menit): ");
        lama_bermain = ael.nextInt();

        total_biaya = (lama_bermain / 60) * jam_Penuh
                    + (lama_bermain % 60) * sisa_Menit;

        potongan = total_biaya * diskon / 100;
        biaya_member = total_biaya - potongan;

        System.out.println("Output");
        System.out.println("Lama bermain : " + lama_bermain + " menit");
        System.out.println("Total biaya  : Rp" + total_biaya);
        System.out.println("Potongan     : Rp" + potongan);
        System.out.println("Biaya member : Rp" + biaya_member);
    }
}