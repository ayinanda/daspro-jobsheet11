import java.util.Scanner;

public class hitungTotalHarga09 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        switch (kodePromo) {
            case "DISKON 50%":
                System.out.println("Selamat! Anda mendapatkan diskon sebesar 50%!");
                break;
            case "DISKON 30%":
                System.out.println("Selamat! Anda mendapatkan diskon sebesar 30%!");
                break;
            default:
                System.out.println("Kode promo tidak valid.");
                break;
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam -- Rp 15,000");
        System.out.println("2. Cappuccino -- Rp 20,000");
        System.out.println("3. Latte -- Rp 22,000");
        System.out.println("4. Teh Tarik -- Rp 12,000");
        System.out.println("5. Roti Bakar -- Rp 10,000");
        System.out.println("6. Mie Goreng -- Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga09(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON 50%")) {
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo.equals("DISKON 30%")) {
            hargaTotal = hargaTotal * 70 / 100;
        }
        return hargaTotal; 
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON 50%");

        Scanner sc09 = new Scanner(System.in);

        int totalKeseluruhan = 0;
        boolean lanjutkanPesanan = true;

        while (lanjutkanPesanan) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc09.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc09.nextInt();
            System.out.print("Masukkan kode promo (jika ada, kosongkan jika tidak): ");
            sc09.nextLine();
            String kodePromo = sc09.nextLine();

            int totalHarga = hitungTotalHarga09(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print(" total harga untuk pesanan ini: Rp " + totalHarga);
            System.out.print(" Apakah Anda ingin memesan lagi? (y/n) : ");
            String jawaban = sc09.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                lanjutkanPesanan = false;
            }
        }

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalKeseluruhan);

        sc09.close(); 
    }
}
