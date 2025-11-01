package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, nilai, noK = 0;
        float totalNilai, rataNilai, tertinggi = 0;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

           totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
               nilai = sc.nextInt();
                totalNilai += nilai;
            }
           rataNilai = totalNilai/5;
           if (rataNilai > tertinggi) {
            tertinggi = rataNilai;
            noK = i;
           }
           System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            i++;
        }
        System.out.println("Nilai kelompok dengan rata-rata tertinggi diraih oleh kelompok " + noK + " dengan nilai = " + tertinggi);
    }
    
}
