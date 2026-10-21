import java.util.Scanner;
public class TugasBioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        int totalHarga;
        int diskon;
        int totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = totalHarga * 15 / 100;
            } else if (jumlahTiket > 4) {
                diskon = totalHarga * 10 / 100;
            } else {
                diskon = 0;
            }

            totalHarga = totalHarga - diskon;
            totalTiket = totalTiket + jumlahTiket;
            totalPenjualan = totalPenjualan + totalHarga;

            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total harga tiket: Rp" + totalHarga);

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp" + totalPenjualan);

        sc.close();
    }
}
