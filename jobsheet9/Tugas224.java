package jobsheet9;

import java.util.Scanner;

public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahP = sc.nextInt();
        sc.nextLine();

        String [] namaM = new String[jumlahP];
        double [] hargaM = new double[jumlahP];
        double totalN = 0;

        System.out.println("==== INPUT DATA PESANAN ====");
        for (int i = 0; i < jumlahP;i++){
            System.out.print("Masukkan nama pesanan ke-"+(i+1)+" : ");
            namaM[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-"+(i+1)+" Rp.");
            hargaM[i] = sc.nextDouble();
            sc.nextLine();
            totalN += hargaM[i];
        }
        System.out.println("==============================");
        System.out.println("======= DAFTAR PESANAN =======");
        System.out.println("==============================");
        System.out.println("No\tNama pesanan\t\tHarga");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < jumlahP; i++){
            System.out.println((i+1)+" "+"\t"+namaM[i]+"\t\t"+"Rp."+hargaM[i]);
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Total biaya : Rp. %.2f\n",totalN);
    }   
}
