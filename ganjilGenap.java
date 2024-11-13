import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = 0;
        System.out.println("Masukkan bilangan: ");
        bilangan = input.nextInt();
        System.out.println();
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
        input.close();
    }
}
