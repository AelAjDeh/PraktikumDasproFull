package P6;

import java.util.Scanner;

public class Latihan2Diskon05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlah;
        double diskon;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlah = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlah > 3) {
                diskon = 8 + 2;
            } else {
                diskon = 8;
            }
        } else {
            if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlah > 4) {
                    diskon = 6 + 2;
                } else {
                    diskon = 6 + 1;
                }
            } else {
                if (jumlah > 4) {
                    diskon = 4;
                } else {
                    diskon = 0;
                }
            }
        }

        System.out.println("Jumlah buku : " + jumlah);
        System.out.println("Diskon yang diperoleh : " + diskon + "%");

        sc.close();
    }
}