package P6;

import java.util.Scanner;

public class nestedAksesLab05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.println("Mahasiswa Aktif? (true/false)");
        mahasiswaAktif = ael.nextBoolean();
        System.out.println("Sedang Disanksi? (true/false)");
        sedangDisanksi = ael.nextBoolean();
        System.out.println("Memiliki izin dosen? (true/false)");
        punyaIzinDosen = ael.nextBoolean();
        System.out.println("Apakah asisten Lab? (true/false)");
        asistenLab = ael.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atu status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
