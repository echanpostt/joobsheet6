import java.util.Scanner;
/**
 * Pemilihan2Percobaan106
 */
public class Pemilihan2Percobaan106 {

    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         System.out.println("masukkan tahun: ");
         int tahun = sc.nextInt();

         if ((tahun%4) == 0){
            if ((tahun%100) != 0)
            System.out.println(" Tahun kabisat");
         }  else
         System.out.println(" Tahun bukan kabisat");
    }
} 