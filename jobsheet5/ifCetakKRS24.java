package jobsheet5;
import java.util.*;
public class ifCetakKRS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        String hasil = uktLunas
        ? "Pembayaran UKT Terverifikasi\nSilahkan Cetak KRS Dan Minta TTD DPA"
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println("[Ternary] " + hasil);

        sc.close();
    }
}