import java.util.Scanner;

public class Kafe22 {
    
    public static void Menu (String namaPelanggan, String kodePromo, boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("====MENU RESTO KAFE====");
        System.out.println("1. Kopi Hitam - Rp.15,000");
        System.out.println("2. Cappucinno - Rp.20,000");
        System.out.println("3. Latte - Rp.22,000");
        System.out.println("4. Teh Tarik - Rp.12,000");
        System.out.println("5. Roti Bakar - Rp.10,000");
        System.out.println("6. Mie Goreng - Rp.18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo invalid.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi","DISKON50", true);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda adalah Rp. " + totalHarga);
    }
}
