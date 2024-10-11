import java.util.Scanner;
public class TarifParkir23 {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    int jenisKendaraan, durasiParkir, totalPendapatan = 0;

    while (true) { 
        System.out.println("Pilih jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar)");
        jenisKendaraan = sc.nextInt();

        if (jenisKendaraan == 0) {
            break;
        }
        System.out.print("Masukkan durasi parkir (jam): ");
        durasiParkir = sc.nextInt();

        int tarifPerJam;
        if (jenisKendaraan == 1) {
            tarifPerJam = 3000;
        } else {
            tarifPerJam = 2000;
        }

        int biayaParkir;
        if (durasiParkir <= 5) {
            biayaParkir = durasiParkir * tarifPerJam;
        } else {
           biayaParkir = 12500; 
        }

        totalPendapatan += biayaParkir;
        

        System.out.println("Biaya parkir: Rp " + biayaParkir);
    }
    
    System.out.println("Total pendapatan parkir: Rp " + totalPendapatan);
    
    }
}