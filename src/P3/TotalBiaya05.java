package P3;

import java.util.Scanner;

public class TotalBiaya05 {
    public static void main(String[] args) {
     Scanner ael = new Scanner(System.in);
     
     int lembar, b_cetak = 500, jilid = 5000 , t_biaya;

     System.out.println("Masukkan jumlah lembar:");
     lembar = ael.nextInt();

    t_biaya = lembar * b_cetak + jilid;

    System.out.println("Total pembayaran membukuan "+ t_biaya);
    }
}
