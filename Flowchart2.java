import java.util.Scanner;

public class Flowchart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jeniBuku = scanner.nextLine().toLowerCase();
        
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();        
        double diskon = 0;
        
        if (jeniBuku.equals("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jeniBuku.equals("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else if(jumlahBuku == 3 || jumlahBuku <3) {
                diskon += 0.01;
            }
        } else if (jumlahBuku > 3) {
            diskon = 0.05;
        }
        
        System.out.println("Total diskon: " + (diskon * 100) + "%");
        scanner.close();
}
}