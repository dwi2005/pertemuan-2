/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ADMIN
 */

   import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianLayanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> antrian = new LinkedList<>();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN LAYANAN PELANGGAN ===");
            System.out.println("1. Tambah pelanggan ke antrian");
            System.out.println("2. Layani pelanggan (panggil antrian)");
            System.out.println("3. Lihat pelanggan berikutnya");
            System.out.println("4. Tampilkan seluruh antrian");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.add(nama);
                    System.out.println("Pelanggan '" + nama + "' masuk ke antrian.");
                    break;

                case 2:
                    if (!antrian.isEmpty()) {
                        String dilayani = antrian.poll();
                        System.out.println("Melayani pelanggan: " + dilayani);
                    } else {
                        System.out.println("Antrian kosong. Tidak ada pelanggan yang dilayani.");
                    }
                    break;

                case 3:
                    if (!antrian.isEmpty()) {
                        System.out.println("Pelanggan berikutnya: " + antrian.peek());
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 4:
                    if (!antrian.isEmpty()) {
                        System.out.println("Daftar antrian saat ini:");
                        int nomor = 1;
                        for (String pelanggan : antrian) {
                            System.out.println(nomor + ". " + pelanggan);
                            nomor++;
                        }
                    } else {
                        System.out.println("Antrian masih kosong.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}
 

