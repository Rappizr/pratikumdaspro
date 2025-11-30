package jobsheet11;

public class kubus24 {
    public static int hitungVolume(int sisi){
        return sisi * sisi * sisi;
    }
    public static int hitungLuasPermukaan(int sisi){
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        int sisi = 5;
        System.out.println("Sisi kubus : "+sisi);
        System.out.println("Volume kubus : "+hitungVolume(sisi));
        System.out.println("Luas permukaan kubus : "+hitungLuasPermukaan(sisi));
    }
    
}
