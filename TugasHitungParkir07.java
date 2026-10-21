import java.util.Scanner;

public class TugasHitungParkir07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis = 0;
        int durasi = 0;
        int total = 0;

        do {
            System.out.print("Pilih jenis (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Berapa lama parkirnya (jam)? ");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total biaya parkir: Rp " + total);

        input.close();
    }
}
