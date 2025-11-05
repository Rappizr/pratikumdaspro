package jobsheet9;

import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlahNM = sc.nextInt();

        int[] arrN = new int[jumlahNM];
        int hasil = -1;

        for (int i = 0;i < jumlahNM;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrN[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        for (int i = 0; i < arrN.length;i++){
            if(key == arrN[i]){
                hasil = i;
                break;
            }
        }
        System.out.println();

        if (hasil != -1) {
            System.out.println("Nilai "+key+" ketemu, "+"merupakan nilai mahasiswa ke-"+(hasil+1));
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }   
}
