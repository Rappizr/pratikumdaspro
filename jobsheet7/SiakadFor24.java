package jobsheet7;

import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100,nilaiL = 60.0;
        int jumlahL = 0, jumlahTL = 0;
     
        
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai Mahasiswa Ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > nilaiL) {
                jumlahL++;
            }else {
                jumlahTL++;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("\n==== JUMLAH LULUS & TIDAK LULUS ====");
        System.out.println("Jumlah Lulus : " + jumlahL);
        System.out.println("Jumlah Tidak Lulus : " + jumlahTL);
    }
    
}