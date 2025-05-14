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

public class queuelibrary {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        int pilihan;

        do {
            System.out.println("\n===== MENU QUEUE (Library) =====");
            System.out.println("1. Tambah data (Enqueue)");
            System.out.println("2. Hapus data terdepan (Dequeue)");
            System.out.println("3. Lihat data terdepan (Peek)");
            System.out.println("4. Tampilkan isi queue");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data: ");
                    String data = input.nextLine();
                    queue.add(data); // enqueue
                    System.out.println("Data '" + data + "' ditambahkan.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String removed = queue.poll(); // dequeue
                        System.out.println("Data '" + removed + "' dihapus.");
                    } else {
                        System.out.println("Queue kosong.");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Data terdepan: " + queue.peek());
                    } else {
                        System.out.println("Queue kosong.");
                    }
                    break;

                case 4:
                    System.out.println("Isi queue: " + queue);
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
