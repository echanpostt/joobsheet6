import java.util.Scanner;
public class pemilhan2percobaan106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tahun : ");
        int tahun = sc.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun kabisat");
        }
        else
        System.out.println("Bukan tahun kabisat");
    }
}
