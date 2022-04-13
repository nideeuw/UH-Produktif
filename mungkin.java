import java.util.Scanner;

public class mungkin {
    public static void main(String[] args) {
        int n, k, array[];
        int nilai = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        n = input.nextInt();
        System.out.print("Masukkan angka K: ");
        k = input.nextInt();

        array = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
            nilai = array[i] + array[i];
        }

        for (int j = 0; j < n; j++) {
            if (k == nilai) {
                System.out.println("BISA");
            } else {
                System.out.println("TIDAK BISA");
            }
        }
    }
}
