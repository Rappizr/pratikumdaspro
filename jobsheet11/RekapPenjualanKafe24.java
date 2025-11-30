package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanKafe24 {
    public static void inputDataPenjualan(int[][] data, String[] namaMenu, int nHari, Scanner sc) {
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Masukkan data untuk menu: " + namaMenu[i]);
            for (int h = 0; h < nHari; h++) {
                System.out.print("  Hari ke-" + (h + 1) + " : ");
                int v = sc.nextInt();
                while (v < 0) {
                    System.out.print("Nilai tidak boleh negatif. Masukkan lagi: ");
                    v = sc.nextInt();
                }
                data[i][h] = v;
            }
            System.out.println();
        }
    }
    public static void tampilDataPenjualan(int[][] data, String[] namaMenu, int nHari) {
        System.out.println("\n=== Rekap Penjualan tabel ===");
        System.out.printf("%-20s", "Menu per Hari");
        for (int h = 0; h < nHari; h++) {
            System.out.printf("D%-6d", h + 1);
        }
        System.out.printf("%-10s%n", "Total");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("%-20s", namaMenu[i]);
            int total = 0;
            for (int h = 0; h < nHari; h++) {
                System.out.printf("%-6d ", data[i][h]);
                total += data[i][h];
            }
            System.out.printf("  %-10d%n", total);
        }
    }
    public static int indexMenuTertinggi(int[][] data) {
        int idxMax = 0;
        int maxTotal = -1;
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int h = 0; h < data[i].length; h++) sum += data[i][h];
            if (sum > maxTotal) {
                maxTotal = sum;
                idxMax = i;
            }
        }
        return idxMax;
    }
    public static int[] totalPerMenu(int[][] data) {
        int[] totals = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int s = 0;
            for (int h = 0; h < data[i].length; h++) s += data[i][h];
            totals[i] = s;
        }
        return totals;
    }
    public static double[] rataRataPerMenu(int[][] data) {
        int nHari = data[0].length;
        double[] avg = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            int s = 0;
            for (int h = 0; h < nHari; h++) s += data[i][h];
            avg[i] = (double) s / nHari;
        }
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REKAP PENJUALAN CAFE ===");
        System.out.print("Masukkan jumlah menu yang ingin direkap: ");
        int nMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int nHari = sc.nextInt();
        sc.nextLine(); 
        String[] namaMenu = new String[nMenu];
        for (int i = 0; i < nMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine().trim();
            if (namaMenu[i].isEmpty()) {
                namaMenu[i] = "Menu" + (i + 1);
            }
        }
        int[][] data = new int[nMenu][nHari];
        inputDataPenjualan(data, namaMenu, nHari, sc);
        tampilDataPenjualan(data, namaMenu, nHari);
        int[] totals = totalPerMenu(data);
        int idxMax = indexMenuTertinggi(data);
        System.out.println("\n=== Menu dengan total penjualan tertinggi ===");
        System.out.println("Menu: " + namaMenu[idxMax] + "  | Total = " + totals[idxMax]);
        double[] avgs = rataRataPerMenu(data);
        System.out.println("\n=== Rata-rata penjualan per menu (selama " + nHari + " hari) ===");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("%-20s : %.2f%n", namaMenu[i], avgs[i]);
        }
        sc.close();
    }
}
