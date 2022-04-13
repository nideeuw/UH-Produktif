import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Bilangan " + a + " adalah genap.\n");
        } else {
            System.out.println("Bilangan " + a + " adalah ganjil.\n");
        }
    }
}