package jobsheet5;

import java.util.Scanner;

public class hotspot24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-- Layanan WIFI Gratis Kampus --");
        System.out.print("Halo Pengguna Baru kamu siapa? dosen, mahasiswa atau penyusup? : ");
        String pengguna = sc.next();

        switch (pengguna){
            case "dosen":
            System.out.println("oh ternyata bapak/ibu dosen hehe:)");
            System.out.println("Akses WiFi diberikan (dosen)");
            break;
            case "mahasiswa":
            System.out.println("hallo sobat ternyata kamu mahasiswa sini ya hehe");
            System.out.print("tolong masukan jumlah sksmu berapa untuk persyaratan masuk wifi ya sobat : ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
                break;
            default:
            System.out.println("akses ditolak kamu bukan bagian dari kampus, mohon maaf");

        }
        sc.close();
    }
}
