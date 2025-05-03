/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author ADMIN
 */

    import java.util.Stack;
import java.util.Scanner;

public class StackSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int pilihan;

        do {
            System.out.println("\n===== MENU STACK =====");
            System.out.println("1. Tambah data (Push)");
            System.out.println("2. Hapus data teratas (Pop)");
            System.out.println("3. Lihat data teratas (Peek)");
            System.out.println("4. Tampilkan isi stack");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // hapus newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data: ");
                    String data = input.nextLine();
                    stack.push(data);
                    System.out.println("Data '" + data + "' ditambahkan.");
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        String removed = stack.pop();
                        System.out.println("Data '" + removed + "' dihapus.");
                    } else {
                        System.out.println("Stack kosong. Tidak bisa menghapus.");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Data teratas: " + stack.peek());
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;

                case 4:
                    System.out.println("Isi stack: " + stack);
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 5);

        input.close();
    }
}


