import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = input.nextInt();

        int angka = (b > a) ? b : a;
        System.out.println("Angka yang lebih besar: " + angka);
    }
}
