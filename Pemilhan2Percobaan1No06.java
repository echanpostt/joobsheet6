import java.util.Scanner;
public class Pemilhan2Percobaan1No06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        System.out.println("Masukkan tahun : ");
        int tahun = input06.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun kabisat");
        }
        else
        System.out.println("Bukan tahun kabisat");
        
    }
}
