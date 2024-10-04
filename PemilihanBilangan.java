import java.util.Scanner;

public class PemilihanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3;
        System.out.println("Masukkan bilangan : ");
        bilangan1 = input.nextInt();
        System.out.println("Masukkan bilangan : ");
        bilangan2 = input.nextInt();
        System.out.println("Masukkan bilangan : ");
        bilangan3 = input.nextInt();
        if (bilangan1 > bilangan2 && bilangan1 > bilangan3) {
            System.out.println("Bilangan terbesar adalah " + bilangan1);
        } else if (bilangan2 > bilangan1 && bilangan2 > bilangan3) {
            System.out.println("Bilangan terbesar adalah " + bilangan2);
        } else {
            System.out.println("Bilangan terbesar adalah " + bilangan3);
        }

    }
}
