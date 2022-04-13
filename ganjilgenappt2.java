import java.util.Scanner;

public class ganjilgenappt2 {
    public static void main(String[] args) {
        int n, array[];
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        n = input.nextInt();

        array = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (int i = 0; i < n; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();

            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " Genap");
            } else if (array[i] % 2 != 0) {
                System.out.println(array[i] + " Ganjil");
            } else {
                System.out.println("Tidak Termasuk");
            }
        }
    }
}