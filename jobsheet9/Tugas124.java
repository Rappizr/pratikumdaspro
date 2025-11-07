package jobsheet9;

import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang diinput : ");
        int jumlahNM = sc.nextInt();
        int[] nilaiMhs = new int[jumlahNM];
        int totalN = 0,nilaiT = -1,nilaiTer = 101;

        System.out.println("==== INPUT NILAI ====");
        for (int i = 0; i < jumlahNM;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
            totalN += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiT) {
                nilaiT = nilaiMhs[i];
            }if (nilaiMhs[i] < nilaiTer) {
                nilaiTer = nilaiMhs[i];
            }
        }
        double rata2 =(double)totalN/jumlahNM;
        System.out.println("\n==============================");
        System.out.println("HASIL INPUTAN NILAI MAHASISWA");
        System.out.println("==============================\n");
        System.out.printf("Nilai rata-rata : %.2f\n", rata2);
        System.out.println("Nilai Tertinggi : "+nilaiT);
        System.out.println("Nilai Terendah : "+nilaiTer);
        System.out.println("\nSemua nilai dimasukkan");
        for (int i = 0;i < jumlahNM;i++){
            System.out.print(nilaiMhs[i]);
            if (i < jumlahNM -  1) {
                System.out.print(",");
            }
        }
    }  
}
