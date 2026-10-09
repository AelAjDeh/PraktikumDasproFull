package P5;

import java.util.Scanner;

public class Tugas1Pemilihan05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        System.out.println("-----CETAK KRS SIAKAD-----");
        System.out.print("Apakah UKT Suddah Lunas? (true/false):");
        boolean uktLunas = ael.nextBoolean();

        String status = uktLunas ? "Pembayaran UKT Terverifikasi" : "Silahkan Cetak KRS dan meminta tanda tangan DPA";
        System.out.println(status);
    }
}