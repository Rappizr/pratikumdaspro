package jobsheet9;

import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String ask;

        System.out.println("===== PROGRAM SEARCH MENU =====");
        System.out.println("------ DAFTAR MENU ------");
        for (int i = 0;i < menu.length;i++){
            System.out.println("Menu "+(i+1)+" : "+menu[i]);
        }
        System.out.println("---- MENCARI ----");
        
        do {
            int hasil = 0;
            System.out.print("Masukkan nama menu : ");
            String key = sc.nextLine();

            for (int i = 0; i < menu.length;i++){
                if (key.equalsIgnoreCase(menu[i])) {
                    hasil = i+1;
                    System.out.println("Menu "+ menu[i]+" tersedia di daftar menu no."+hasil);
                    break;
                }
            }
            if (hasil == 0) {
                System.out.println("Menu "+key+" tidak tersedia");
            }
            System.out.print("apakah masih lanjut mencari menu? (y/n)");
            ask = sc.nextLine();
            System.out.println();
        }while (ask.equalsIgnoreCase("Y"));
        System.out.println("===========================");
        System.out.println("===== PROGRAM SELESAI =====");
        System.out.println("===========================");
    }
    
}
