// import java.util.Scanner;
// /**
//  * pemilhan2percobaan206
//  */
// public class Pemilihan2Percobaan2no06 {

//     public static void main(String[] args) {
//         Scanner input06 = new Scanner(System.in);
//         System.out.println("masukkan pilihan menu : ");
//         String menu,member;
//         double diskon,total_bayar;
//         int pilihan_menu, jumlah_beli ;
//         int harga = 0;

//         System.out.println("-------------------------");
//         System.out.println("===== MENU KAFE JTI =====");
//         System.out.println("-------------------------");
//         System.out.println("1. Ricebowl");
//         System.out.println("2. Ice Tea");
//         System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
//         System.out.println("-------------------------------------");
//         System.out.println("masukkan angka dari menu yang dipilih = ");
//         pilihan_menu = input06.nextInt();
//         input06.nextLine();
//         System.out.println("apakah anda member (ya/tidak) ? = ");
//         member = input06.nextLine();
//         System.out.println("--------------------------------------");

//         if (member.equalsIgnoreCase("ya")) { //Menggunakan equalsIgnoreCase untuk membandingkan string
//             diskon = 0.10;
//             System.out.println("besar diskon = 10%");
//             if  (pilihan_menu == 1) {
//                 harga = 14000;
//                 System.out.println("harga Ricebowl= " + harga);
//             } else if (pilihan_menu == 2) {
//                 harga = 3000 ;
//                 System.out.println("harga Ice Tea = " + harga);
//             } else if (pilihan_menu == 3) {
//                 harga = 15000;
//                 System.out.println("harga Paket Bunding = " + harga);
//             } else {
//                 System.out.println("masukkan pilihan menu dengan benar");
//                 return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
//             }    
// //menghitung total bayar setelah diskon 
// total_bayar = harga - (harga * diskon);
// System.out.println("total bayar setelah diskon = " + total_bayar);

//         } else if (member.equalsIgnoreCase("tidak")) {
//             if  (pilihan_menu == 1) {
//                 harga = 14000;
//                 System.out.println("harga Ricebowl = " + harga);
//             } else if (pilihan_menu == 2) {
//                 harga = 3000;
//                 System.out.println("harga Ice Tea = " + harga);
//             } else if (pilihan_menu == 3) {
//                 harga = 15000;
//                 System.out.println("harga Paket Bunding = " + harga);
//             } else {
//                 System.out.println("masukkan pilihan menu dengan benar");
//                 return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
//             }
//             System.out.println("total bayar = " + harga);

//         } else {
//             System.out.println("member tidak valid"); //Menghentikan eksekusi lebih lanjut jika pilihan salah
//         }
//         System.out.println("--------------------------------------");

//     }
// }
import java.util.Scanner;

public class Pemilihan2Percobaan2no06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pilihan_menu;
        String member;
        double diskon, harga, totalBayar;

        System.out.println("-----------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextByte();
        System.out.print("Apakah punya member (ya/tidak) ? = ");
        member = input.next();
        System.out.print("Metode Pembayaran (QRIS/ cash) = ");
        String metodePembayaran = input.next();
        System.out.println("-----------------------------");

        if (member.equalsIgnoreCase("ya")) {
            diskon = 0.10;
            System.out.println("Besar diskon= 10% ");
        } else if (member.equalsIgnoreCase("tidak")) {
            diskon = 0.0;
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = Rp" + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = Rp" + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = Rp" + harga);
        } else {
            System.out.println("Masukkan menu yang benar");
            return;
        }

        totalBayar = harga - (harga * diskon);
        if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar -= 1000;
        }
        System.out.println("Total bayar = Rp" + totalBayar);
        System.out.println("-------------------------------------");
    }
}