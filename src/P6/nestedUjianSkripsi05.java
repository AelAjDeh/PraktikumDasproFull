package P6;

import java.util.Scanner;

public class nestedUjianSkripsi05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.println("Apakah mahasis wa sudha bebas kompen? Ya/Tidak");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Mauskkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 5 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendafar ujian skripsi";
            } else if (bimbinganP1 < 5 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 5 kali dan Log bimbingan P2 belum mencapai 5 kali";
            }else if (bimbinganP1 < 5) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 5 kali";
            }else{
                pesan = "Gagal! Log bimbingan P2 belum mencapai 5 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

    }
    
}
