package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Apakah Mahasiswa Sudah Bebas Kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukan Jumlah Log Bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukan Jumlah Log Bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan= "semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }else if (bimbinganP1 < 8){
                pesan = "gagal! log bimbingan P1 belum mencapai 8 kali";
            }else {
                pesan = "gagl! log bimbingan P2 belum mencapai 4 kali";
            }
        }else{
            pesan = "gagal! mahasiswa masih memiliki kompen";
        }
        System.out.println(pesan);
    }
    
}
