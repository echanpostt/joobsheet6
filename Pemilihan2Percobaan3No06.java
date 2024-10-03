import java.util.Scanner;
/**
 * Pemilihan2Percobaan3No06
 */
public class Pemilihan2Percobaan3No06 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        String kategori;
        int gajiBersih, penghasilan;
        double pajak = 0;
        System.out.println("masukkan kategori : ");
        kategori = input06.nextLine();
        System.out.println("masukkan besarnya penghasilan : ");
        penghasilan = input06.nextInt(); 
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 200000)
                pajak = 0.1;
            else if (penghasilan <= 300000) 
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - penghasilan * pajak);
            System.out.println("penghasilan bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2500000)
                pajak = 0.1;
            else if (penghasilan <= 3500000) 
                pajak = 0.2;
            else
                pajak = 0.15;
            gajiBersih = (int) (penghasilan - penghasilan * pajak);
            System.out.println("penggayahan bersih : " + gajiBersih);
        } else
            System.out.println("kategori tidak valid");
    }
}