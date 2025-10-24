package jobsheet7;

import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        int kopi,teh,roti,hargaKopi = 12000,hargaTeh = 7000, hargaRoti = 20000,totalHarga;
        String namaPelanggan;
     
        do {
            System.out.print("Masukan Nama Pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh : ");
            teh = sc.nextInt();
            System.out.print("jumlah roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("total yang harus di bayar Rp. : " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("semua transaksi selesai.");
    }
}