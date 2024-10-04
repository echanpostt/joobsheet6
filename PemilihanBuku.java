import java.util.Scanner;
public class PemilihanBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        System.out.println("Masukkan Jenis Buku : ");
        jenisBuku = input.nextLine();
        System.out.println("Masukkan Jumlah Buku : ");
        jumlahBuku = input.nextInt();
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            System.out.println("diskon kamus : " + (2500 * jumlahBuku));
        } else if (jenisBuku.equalsIgnoreCase("Komik")) {
        
    }
    
}}
