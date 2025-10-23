package jobsheet5;

import java.util.Scanner;

public class bioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hartik = 50000, jumlahT, totalTT = 0;
        double totalP = 0;

        System.out.println("==== PROGRAM PENJUALAN TIKET BIOSKOP ====");
        System.out.println("Masukkan jumlah tiket yang di beli tiap pelanggan!!!");
        System.out.println("Masukan angka 0 jika tidak ada pelanggan lagi.");

        do { 
            System.out.print("\nMasukkan jumlah tiket : ");
            jumlahT = sc.nextInt();

            if (jumlahT < 0) {
                System.out.println("Jumlah tiket tidak boleh < 0. silahkan input kembali!!");
                continue;
            }if (jumlahT == 0) {
                break;
            }

            double totalH = jumlahT * hartik, discount = 0;

            if (jumlahT > 10) {
                discount = 0.15 * totalH;
            }else if (jumlahT > 4) {
                discount = 0.10 * totalH;
            }

            double hargaSD = totalH - discount;

            System.out.println("Total harga sebelum diskon : " + totalH);
            System.out.println("Dikon : " + discount);
            System.out.println("Total yang harus di bayar : " + hargaSD);

            totalTT += jumlahT;
            totalP += hargaSD;
        } while (true);

        System.out.println("\n==== LAPORAN PENJUALAN HARIAN ====");
        System.out.println("Total transaksi harian : " + totalTT + " Tiket");
        System.out.println("Total penjualan : " + totalP);
        System.out.println("==== TERIMA KASIH ====");

        sc.close();
        
    }
    
}
