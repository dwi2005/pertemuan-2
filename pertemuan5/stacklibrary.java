/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author pc5
 */

import java.util.Stack;

public class stacklibrary {
    public static void main(String[] args) {
        // Membuat objek Stack
        Stack<String> stack = new Stack<>();

        // Menambahkan elemen ke Stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Menampilkan semua elemen dalam Stack
        System.out.println("Isi stack: " + stack);

        // Melihat elemen teratas tanpa menghapusnya
        System.out.println("Elemen teratas: " + stack.peek());

        // Menghapus elemen teratas
        String removed = stack.pop();
        System.out.println("Elemen yang di-pop: " + removed);

        // Menampilkan isi stack setelah pop
        System.out.println("Isi stack sekarang: " + stack);

        // Mengecek apakah stack kosong
        if (stack.isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Stack tidak kosong.");
        }
    }
}
