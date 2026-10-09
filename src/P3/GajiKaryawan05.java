package P3;
import java.util.Scanner;

public class GajiKaryawan05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        System.out.println("Masukkan gaji pokok");
        gajiPokok=ael.nextInt();

        bonus = 0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-0.1*gajiPokok;

        System.out.println("Bonus bulanan anda adalah Rp" + bonus);
        System.out.println("Total gaji yang diterima adalah Rp" + (int)totGaji);
    }
    
}
