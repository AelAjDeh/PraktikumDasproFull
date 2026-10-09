package P6;
import java.util.Scanner;

public class tugas2SeleksiAsisten05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean statusAktif = sc.nextBoolean();

        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sanksiAkademik = sc.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDasarPemrograman = sc.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = sc.nextBoolean();

        System.out.print("Masukkan nilai wawancara: ");
        int nilaiWawancara = sc.nextInt();

        if (statusAktif && !sanksiAkademik) {
            if (nilaiDasarPemrograman >= 80 || sertifikat) {
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara.");
                    System.out.println("Alasan: Nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("Mahasiswa gagal pada tahap seleksi akademik.");
                System.out.println("Alasan: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman.");
            }
        } else {
            System.out.println("Mahasiswa gagal pada tahap seleksi awal.");
            if (!statusAktif && sanksiAkademik) {
                System.out.println("Alasan: Status mahasiswa tidak aktif dan sedang mendapatkan sanksi akademik.");
            } else if (!statusAktif) {
                System.out.println("Alasan: Status mahasiswa tidak aktif.");
            } else {
                System.out.println("Alasan: Mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }

        sc.close();
    }
}