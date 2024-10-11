import java.util.Scanner;
public class PenjualanTiket23 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

       int jmlTiketTerjual = 0;
       double hargaTiket = 50000, diskon, totalHargaPenjualan = 0;

       System.out.println("Program Penghitung Penjualan Tiket Bioskop");
       
        do { 
           System.out.print("Masukkan jumlah tiket yang terjual: ");
           jmlTiketTerjual = sc.nextInt();

           if (jmlTiketTerjual < 0) {
              System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
              continue;
           } else if (jmlTiketTerjual == 0) {
               break;
           }

           totalHargaPenjualan += jmlTiketTerjual;

           diskon = 0;
           if (jmlTiketTerjual > 4) {
              diskon = 0.1;
           } else if (jmlTiketTerjual > 10) {
               diskon = 0.15;
           }

            double hargaSetelahDiskon = hargaTiket * jmlTiketTerjual * (1-diskon);
            totalHargaPenjualan += hargaSetelahDiskon;

            System.out.println("Total penjualan untuk transaksi ini: Rp " + hargaSetelahDiskon);
            break;
        } while (true);
           
        }
    }
