import java.util.Scanner;

public class jumlah {
    public static void main(String[] args) {
        int a;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            counter = counter + i;
            System.out.println("Hasil: " + counter);
        }
    }
}
