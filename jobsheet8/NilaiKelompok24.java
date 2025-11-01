package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

           float totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
               int nilai = sc.nextInt();
                totalNilai += nilai;
            }
           float rataNilai = totalNilai/5;
           System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            i++;
        }
    }
    
}
