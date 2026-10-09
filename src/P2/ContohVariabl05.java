package P2;

public class ContohVariabl05{
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain Bola Voli";
        boolean Is_Pandai = true;
        char Jenis_Kelamin = 'L';
        byte Umur_SayaSekarang = 19;
        double $ipk = 3.86, tinggi_badan = 1.71;

        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah Pandai " + Is_Pandai);
        System.out.println("Jenis Kelamin " + Jenis_Kelamin);
        System.out.println("Umur saya sekarang " + Umur_SayaSekarang);
        System.out.println(String.format("Saya ber ipk %i dengan tinggi badan %i", $ipk, tinggi_badan));
        System.out.printf("Jenis kelaminku adalah %s, umurku %s", Jenis_Kelamin, Umur_SayaSekarang);//harus urut supaya outputnya tetap berurutan
        //String.format berfungi supaya ketika kita ingin memanggil variabel, kita gaperlu + ini + itu cukup langusung menggunakan % dan kode yg penting. dan memiliki shorcut System.out.printf
    }
}