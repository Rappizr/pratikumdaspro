package jobsheet10;

import java.util.Scanner;

public class Tugas24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftarPertanyaan = {
            "Seberapa puaskah Anda dengan kecepatan layanan yang kami berikan?",
            "Seberapa setujukah Anda bahwa layanan yang Anda terima sesuai dengan kebutuhan Anda?",
            "Seberapa puaskah Anda dengan kualitas dari produk yang Anda terima?",
            "Seberapa setujukah Anda bahwa produk/layanan kami berikan nilai yang sepadan dengan harga yang Anda bayarkan?",
            "Seberapa puaskah Anda dengan keramahan dan kesopanan staf/karyawan yang melayani Anda?",
            "Seberapa setujukah Anda bahwa staf/karyawan memiliki pengetahuan yang memadai untuk menjawab pertanyaan atau menyelesaikan masalah Anda?"
        };

        int  jumlahResponder = 10, jumlahPertanyaan = daftarPertanyaan.length;
        int[][] data = new int[jumlahResponder][jumlahPertanyaan];
        System.out.println("=== SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Penilaian 1-5");
        for(int i = 0;i<jumlahResponder;i++){
            System.out.println("\nResponden ke-"+(i+1));
            double totalRR = 0;
            for (int j = 0;j<jumlahPertanyaan;j++){
                System.out.println((j+1)+". "+daftarPertanyaan[j]);
                System.out.print("Masukkan nilai (1-5) : ");
                data[i][j] = sc.nextInt();
                totalRR += data[i][j];
            }
            double rataRespon = totalRR/jumlahPertanyaan;
            System.out.println(" Rata rata responder "+(i+1)+": "+rataRespon);
        }
        System.out.println("\n==========================================================="); 
        System.out.println("RATA-RATA PERTANYAAN"); 
        System.out.println("===========================================================\n");
        for(int j = 0; j < jumlahPertanyaan;j++){
            double total = 0;
        for (int i = 0; i < jumlahResponder;i++){
            total += data[i][j];
        }
        double rataPertanyaan = total/jumlahResponder;
        System.out.println("Pertanyaan "+(j+1)+": "+daftarPertanyaan[j]);
        System.out.println("Rata rata "+rataPertanyaan);
        }
        double totalK = 0;
        for (int i = 0;i<jumlahResponder;i++){
            for (int j = 0;j<jumlahPertanyaan;j++){
                totalK += data[i][j];
            }
        }
        double rataK = totalK/(jumlahPertanyaan*jumlahResponder);
        System.out.println("===========================================================");
        System.out.println("Rata keseluruhan : "+rataK);
        
    }
    
}
