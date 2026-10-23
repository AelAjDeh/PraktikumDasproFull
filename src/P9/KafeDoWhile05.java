package P9;

import java.util.Scanner;

public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int kopi, teh, roti, banyak, totalHarga;
        String namaPelanggan;
        int hargaKopi = 10000, hargaTeh = 6000, hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama Pelanggan (Ketik 'batal untuk keluar): ");
            namaPelanggan = ael.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi = ael.nextInt();

            System.out.println("Jumlah Teh: ");
            teh = ael.nextInt();

            System.out.println("Jumlah Roti: ");
            roti = ael.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);
            ael.nextLine();
        } while (true);

        System.out.println("Smua transaksi selesai");
    }
}
