package P9;
import java.util.Scanner;

public class SiakadFor05 {
    public static void main(String[] args) {
    Scanner ael = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah =100;
        int lulus=0, tdklulus=0;

        for (int i = 1; i <= 8; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = ael.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }else{
                tdklulus++;
            }

        }
        
            System.out.println("Nilai tertinggi:" + tertinggi);
            System.out.println("Nilai terndah: "+ terendah);
            System.out.println("lulus " +lulus);
            System.out.println("tdk " + tdklulus);
    }
}
