package P9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int Kendaraan, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            Kendaraan = ael.nextInt();

            if (Kendaraan == 1 || Kendaraan == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = ael.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (Kendaraan == 1) {
                    total += durasi * 3750;
                } else if (Kendaraan == 2) {
                    total += durasi * 2750;
                }
            } else if (Kendaraan != 0) {
                System.out.println("Kendaraan tidak valid");
            }

        } while (Kendaraan != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}