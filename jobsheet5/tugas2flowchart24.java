package jobsheet5;

import java.util.Scanner;

public class tugas2flowchart24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan angka : ");
        int angka = sc.nextInt();

         if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        sc.close();
    }
}