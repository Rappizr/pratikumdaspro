package jobsheet8;

import java.util.Scanner;

public class KopiSenja24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSP = 0, totalSI = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahC = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        for (int i = 1; i <= jumlahC; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahP = sc.nextInt();

            int totalIC = 0;
            for (int j = 1; j <= jumlahP; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalIC += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahP + " orang");
            System.out.println("- Item terjual: " + totalIC + " item\n");

            totalSP += jumlahP;
            totalSI += totalIC;
        }
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalSP + " orang");
        System.out.println("Item terjual: " + totalSI + " item");
    }
}
