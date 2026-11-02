package P10;

import java.util.Scanner;

public class Triangle05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = ael.nextInt();

        int i = 1;
        while (i <= n ) {
            int j = 6;
            while (j > i) {
                System.out.print("*");
                j--;
            }
            i++;
            System.out.println("");
        }
        ael.close();
    }
}
