package jobsheet11;

import java.util.Scanner;

public class Kafe24 {
    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
    }
    public static void Menu(String namaPelanggan, boolean isMember,String kodepromo) {
        System.out.println("Selamat Datang, "+namaPelanggan+"!");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin anda pesan: ");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan anda: Rp."+totalHarga);
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodepromo.equals("DISKON50")) {
            System.out.println("Kode promo diterima! Anda mendapatkan diskon 50%");
        }else if (kodepromo.equals("DISKON30")) {
            System.out.println("Kode promo diterima! Anda mendapatkan diskon 30%");
        }else {
            System.out.println("Kode promo invalid");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }
}
