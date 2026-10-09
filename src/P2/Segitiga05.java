
package P2;
import java.util.Scanner;

public class Segitiga05 {
    public static void main(String[] args) {
        Scanner Aell = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.println("Masukan alas:");
        alas = Aell.nextInt();

        System.out.println("Masukkan tinggi:");
        tinggi = Aell.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Segitiga: " + luas);
    }
}
