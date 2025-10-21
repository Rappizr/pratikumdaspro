package jobsheet5;

import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100, nilaiLulus = 60.0;
        int jumlahLulus = 0, jumlahTLulus = 0;

        
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan NIlai Mahasiswa Ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > nilaiLulus) {
                jumlahLulus++;
            }else {
                jumlahTLulus++;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("\n===== Jumlah Lulus & Tidak Lulus =====");
        System.out.println("Jumlah Lulus : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus : " + jumlahTLulus);
    }
    
}
