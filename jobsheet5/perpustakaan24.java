package jobsheet5;
import java.util.Scanner;

public class perpustakaan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Sistem Perpustakaan Kampus --");
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean ktm = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean regOnline = sc.nextBoolean();

        if (ktm || regOnline) {
            System.out.println("Boleh Masuk Perpustakaan");
        } else {
            System.out.println("Ditolak Masuk");
        }

        sc.close();
    }
}
