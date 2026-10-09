package P3;

import java.util.Scanner;

public class Cicilan05 {
    public static void main(String[] args) {
        Scanner ael = new Scanner(System.in);

        int harga, u_muka, bulan;
        double bunga = 0.02, sisa, t_bunga, pokok, cicilan;

        System.out.println("Masukkan harga:");
        harga = ael.nextInt();

        System.out.println("Masukkan Uang Muka");
        u_muka = ael.nextInt();

        System.out.println("Masukkan bulan");
        bulan = ael.nextInt();

        sisa = harga - u_muka;
        t_bunga = bunga * sisa;
        pokok = sisa/bulan;
        cicilan = (sisa + t_bunga)/bulan;

        System.out.println("Cicilan yang harus di bayarkan " + (int)cicilan);


    }
    
}
