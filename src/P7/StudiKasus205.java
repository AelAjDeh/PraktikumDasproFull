package P7;
import java.util.Scanner;

public class StudiKasus205 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int jmlDokumen;
        int peringkat;
        int statusPendanaan;

        System.out.println("Nama Mahasiswa: ");
        String Nama = ael.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String jenisKegiatan = ael.nextLine();
        System.out.println("Jumlah Dokumen yang di upload (0-4): ");
        jmlDokumen = ael.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                    System.out.println("Peringkat Juara (1,2,3 isi 0 jika itdak juara): ");
                    peringkat = ael.nextInt();

                    if (peringkat >= 1 && peringkat <= 3) {
                        if (jmlDokumen ==4 ) {
                            System.out.println("Mendapatkan dana penghargaan");
                            System.out.println("Semua dokumen lengkap");

                        } else {
                            System.out.println("Tidak mendapatkan penghargaan");
                            System.out.println("Dokumen Belum lengkap kurang " + jmlDokumen);
                        }
                    }else{
                        System.out.println("Tidak mendapatkan penghargaan");
                    }
        } 
    }
}
