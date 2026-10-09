package P2;

import java.util.Scanner;

public class StudiKasusDua05 {
    public static void main(String[] args) {
        Scanner Aell = new Scanner(System.in);

        int lebarT, panjangT, diameterK, sisiPers, LuasTAwal, luasPers;
        double phi = 3.14, luasK, luasTSisa;

        System.out.print("Masukkan lebar tanah: ");
        lebarT = Aell.nextInt();

        System.out.print("Masukkan panjang tanah: ");
        panjangT = Aell.nextInt();

        System.out.print("Masukkan diameter kolam: ");
        diameterK = Aell.nextInt();

        System.out.print("Masukkan sisi taman: ");
        sisiPers = Aell.nextInt();

        LuasTAwal = lebarT*panjangT;
        luasK = phi*diameterK*diameterK / 4;
        luasPers = sisiPers*sisiPers;
        luasTSisa = LuasTAwal-luasK-luasPers;

        System.out.println("Luas tanah awal = " + LuasTAwal);
        System.out.println("Luas kolam = " + luasK);
        System.out.println("Luas taman  = " + luasPers);
        System.out.println("Luas tanah yang tidak digunakan = " + luasTSisa);
    }
}