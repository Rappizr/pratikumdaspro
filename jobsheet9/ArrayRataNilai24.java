package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int [] nilaiMhs = new int[jumlahMhs];
        double totalL = 0, totalTL = 0;
        int jumlahL = 0, jumlahTL = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalL += nilaiMhs[i];
                jumlahL++;
            }else {
                totalTL += nilaiMhs[i];
                jumlahTL++;
            }
        }
        double rata2L = 0,rata2TL = 0;

        if (jumlahL > 0) {
            rata2L = totalL/jumlahL;
        }if (jumlahTL > 0) {
            rata2TL = totalTL/jumlahTL;
        }

        System.out.println("===========================");
        System.out.println("Rata-rata milai lulus = "+rata2L);
        System.out.println("Rata-rata tidak lulus = "+rata2TL);

    }
    
}
