package P6;

import java.util.Scanner;

public class operatorLogikaWifi05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.println("Apakah pengguna Mahasiswa? (true/false)");
        mahasiswa = ael.nextBoolean();

        System.out.println("Apakah pengguna Dosen? (true/false)");
        dosen = ael.nextBoolean();

        System.out.println("Apakah akun diblokir? (true/false");
        akunDiblokir = ael.nextBoolean();

        if ((mahasiswa || dosen ) && !akunDiblokir) {
            System.out.println("Akses wifi diberikan");
        } else {
            System.out.println("Akses wifi ditolak");
        }
    }
}
