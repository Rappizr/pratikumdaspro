package jobsheet8;

import java.util.Scanner;

public class Kuadrat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahK = 0, kuadrat, n;

        System.out.print("Masukkan jumlah n : ");
        n = sc.nextInt();

      for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + " -> jumlah luadrat = ");
            jumlahK = 0;
            for (int j = 1; j <= i; j++) {
                kuadrat = j * j;
                jumlahK += kuadrat;
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            if (i > 1) {
                System.out.print(" = " + jumlahK);
            }
            System.out.println();
        }
        sc.close();
    }
}
