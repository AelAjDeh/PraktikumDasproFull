package P5;
import java.util.Scanner;

public class TugasAntrean05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int kodeLayanan;

        System.out.print("Masukkan kode layanan: ");
        kodeLayanan = ael.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket A");
                break;

            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
                System.out.println("Loket B");
                break;

            case 3:
                System.out.println("Pembayaran UKT");
                System.out.println("Loket C");
                break;

            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;

            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}