import java.util.Scanner;
public class ModifikasiSiakadFor23 {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int lulus = 0, tidakLulus = 0;
    double nilai, tertinggi = 0, terendah = 100, batasLulus = 60;

    for (int i = 1; i <= 10; i++) {
        System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        if (nilai >= batasLulus){
            lulus++;
        } else {
            tidakLulus++;
        }
    }
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);

    System.out.println("Jumlah Mahasiswa lulus: " + lulus);
    System.out.println("Jumlah Mahasiswa tidak lulus: " + tidakLulus);

    }
}
