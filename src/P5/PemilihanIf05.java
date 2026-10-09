package P5;

import java.util.Scanner;

public class PemilihanIf05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        System.out.println("-----CETAK KRS SIAKAD-----");
        System.out.print("Apakah UKT Suddah Lunas? (true/false):");
        boolean uktLunas = ael.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi ");
            System.out.println("Silahkan Cetak KRS dan Meminta Tanda Tangan DPA");
        } 

        String status = uktLunas ? "Pembayaran UKT Terverifikasi" : "Silahkan Cetak KRS dan Meminta Tanda Tangan DPA";
        System.out.println(status);

    }
}
