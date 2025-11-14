package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
          System.out.println("\n=== MENU BIOSKOP ===");
          System.out.println("1. Input data penonton");
          System.out.println("2. Tampilkan daftar penonton");
          System.out.println("3. Exit");
          System.out.println("Pilih menu");
          menu = sc.nextInt();
          sc.nextLine();
        
          switch (menu) {
           case 1: 
           while (true) {
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris (1-4) : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom (1-2) : ");
            kolom = sc.nextInt();
            sc.nextLine();
            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                if (baris < 1 || baris > 4) {
                    System.out.println("Nomor baris tidak tersedia");
                }else if (kolom < 1 || kolom > 2) {
                    System.out.println("Nomor kolom tidak tersedia");
                }
                continue;
            }
            if (penonton[baris-1][kolom-1] !=null){
                System.out.println("Kursi tersebut sudah diisi oleh : "+penonton[baris-1][kolom-1]);
                System.out.println("Silahkan pilih kursi lainya ya!");
                continue;
            }
            penonton[baris-1][kolom-1]=nama;
            System.out.print("Input penonton lain? (y/n) : ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
           }
           break;
           case 2:
           System.out.println("\n=== DAFTAR PENONTON ===");
           for (int i=0;i < 4;i++){
            for (int j = 0; j < 2;j++){
                String kursi = penonton[i][j];
                if (kursi == null) {
                    kursi = "***";
                }
                System.out.println("Kursi "+(i+1)+", "+ "Kolom "+(j+1)+" : "+kursi);
            }
           }
           break;
           case 3:
           System.out.println("Program selesai terima kasih!");
           return;
           default:
           System.out.println("Maaf tidak valid!");
          }
        }
    }
}
