package jobsheet11;

public class pengunjungKafe24 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar nama pengunjung: ");
        for(String nama : namaPengunjung){
            System.out.println("- "+nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung();

        daftarPengunjung();

        daftarPengunjung();
    }
}
