package P5;
import java.util.Scanner;

public class TugasParkir05{
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int lamaParkir;
        int tarif;

        System.out.print("Masukkan lama parkir (jam): ");
        lamaParkir = ael.nextInt();

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (lamaParkir - 2) * 1000;
        }

        System.out.println("Tarif parkir: Rp " + tarif);
    }
}