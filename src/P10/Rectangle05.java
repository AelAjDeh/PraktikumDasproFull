package P10;

import java.util.Scanner;

public class Rectangle05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        System.out.print("Masukkan Baris: ");
        int baris = ael.nextInt();
        System.out.print("Masukkan Kolom: ");
        int kolom = ael.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j =1; j<= kolom; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        ael.close();
    }
}
