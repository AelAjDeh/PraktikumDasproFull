package P10;

import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = ael.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        ael.close();
    }
}
