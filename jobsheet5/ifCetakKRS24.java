package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Cetak KRS Siakad--");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas){
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS Dan Minta TTD DPA");
        }
        sc.close();
    }
}