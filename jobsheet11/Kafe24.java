package jobsheet11;

import java.util.Scanner;

public class Kafe24 {
    public static final int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
    }
    public static void Menu(String namaPelanggan, boolean isMember, String kodepromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int nJenis = sc.nextInt();
        int totalKeseluruhan = 0;
        for (int i = 1; i <= nJenis; i++) {
            System.out.println("\nPesanan ke-" + i + ":");
            System.out.print("Masukkan nomor menu (1-" + hargaItems.length + "): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
                System.out.println("Pilihan menu tidak valid. Ulangi input untuk pesanan ini.");
                i--; 
                continue;
            }
            System.out.print("Masukkan jumlah item untuk menu " + pilihanMenu + ": ");
            int banyakItem = sc.nextInt();
            int subtotal = hitungSubtotal(pilihanMenu, banyakItem);
            System.out.println("Subtotal untuk menu " + pilihanMenu + " x" + banyakItem + " = Rp " + subtotal);
            totalKeseluruhan += subtotal;
        }

        System.out.println("\nTotal keseluruhan sebelum promo: Rp " + totalKeseluruhan);
        int totalSetelahPromo = applyPromo(totalKeseluruhan, kodepromo);
        System.out.println("Total yang harus dibayar: Rp " + totalSetelahPromo);
        sc.close();
    }
    public static int hitungSubtotal(int pilihanMenu, int banyakItem) {
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int subtotal = hitungSubtotal(pilihanMenu, banyakItem);
        int totalAkhir = subtotal;

        if (kodePromo == null || kodePromo.trim().equals("")) {
            System.out.println("Tidak ada kode promo.");
            return subtotal;
        }
        if (kodePromo.equals("DISKON50")) {
            int diskon = subtotal * 50 / 100;
            System.out.println("Kode promo DISKON50 diterima! Diskon: Rp " + diskon);
            totalAkhir = subtotal - diskon;
        } else if (kodePromo.equals("DISKON30")) {
            int diskon = subtotal * 30 / 100;
            System.out.println("Kode promo DISKON30 diterima! Diskon: Rp " + diskon);
            totalAkhir = subtotal - diskon;
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }
        return totalAkhir;
    }
    public static int applyPromo(int totalHarga, String kodePromo) {
        if (kodePromo == null || kodePromo.trim().equals("")) {
            System.out.println("Tidak ada kode promo yang digunakan.");
            return totalHarga;
        }
        if (kodePromo.equals("DISKON50")) {
            int diskon = totalHarga * 50 / 100;
            System.out.println("Kode promo diterima! Diskon 50% = Rp " + diskon);
            return totalHarga - diskon;
        } else if (kodePromo.equals("DISKON30")) {
            int diskon = totalHarga * 30 / 100;
            System.out.println("Kode promo diterima! Diskon 30% = Rp " + diskon);
            return totalHarga - diskon;
        } else {
            System.out.println("Kode promo invalid. Tidak ada pengurangan total harga.");
            return totalHarga;
        }
    }
}
