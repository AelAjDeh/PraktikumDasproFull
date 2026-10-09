package P7;

import java.util.Scanner;

public class StudiKasus05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup yang anda beli: ");
        jumlahCup = ael.nextInt();

        System.out.println("Masukkan harga bayar: ");
        uangBayar = ael.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (hargaPerCup >= 100000 ) {
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;


        System.out.println("Total harga: "+ totalHarga);
        System.out.println("Diskon: "+diskon);
        System.out.println("Total Bayar: "+ totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;

            System.out.println("Kembalian: "+ kembalian);

        } else {
            kurang = totalBayar - uangBayar;

            System.out.println("Uang Tidak Cukup,");
            System.out.println("Kurang Rp: "+ kurang);
        }
    }
}
	