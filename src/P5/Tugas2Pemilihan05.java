package P5;

import java.util.Scanner;

public class Tugas2Pemilihan05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        System.out.println("Input jumlah SKS");
        int jumlahSks = ael.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Output melibihi batas");
        }
        else{
            System.out.println("KRS Valid");
        }
    }
}