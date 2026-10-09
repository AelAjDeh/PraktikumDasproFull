package P3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);
        int panjang;
        int luas;
        int lebar;

        System.out.println("Masukkan panjang:");
        panjang = ael.nextInt();
        System.out.println("Masukkan lebar");
        lebar = ael.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah "+ luas);
    }
}
