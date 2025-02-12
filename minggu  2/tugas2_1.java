import java.util.Scanner;

public class tugas2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int harga, total = 0;

        System.out.println("-------------------------------------------------");
        System.out.println("         Kharisma Agung Plaza ( KAP )           ");
        System.out.println("          Promo Belanja Berhadiah               ");
        System.out.println("      Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("      Dengan harga minimum Rp 100000,00         ");
        System.out.println("-------------------------------------------------");

        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            harga = scan.nextInt();
            total += harga;
        }

        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);

        if (total >= 100000) {
            System.out.println("\nSelamat...");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }

        System.out.println("\n-------------------------------------------------");
        System.out.println("              Terima Kasih");
        System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
    }
}
