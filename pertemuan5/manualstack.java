/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author pc5
 */
public class manualstack {

    private int maxSize;
    private int top;
    private String[] stackArray;

    // Constructor
    public manualstack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1; // artinya stack kosong
    }

    // Menambahkan elemen ke stack
    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa push: " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Push: " + value);
        }
    }

    // Menghapus elemen teratas
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak bisa pop.");
            return null;
        } else {
            String removed = stackArray[top--];
            System.out.println("Pop: " + removed);
            return removed;
        }
    }

    // Melihat elemen teratas
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada elemen.");
            return null;
        } else {
            return stackArray[top];
        }
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return (top == -1);
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Menampilkan isi stack
    public void printStack() {
        System.out.print("Isi Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        manualstack myStack = new manualstack(5);

        myStack.push("Java");
        myStack.push("Python");
        myStack.push("C++");
        myStack.printStack();

        System.out.println("Top element: " + myStack.peek());

        myStack.pop();
        myStack.printStack();

        myStack.pop();
        myStack.pop();
        myStack.pop(); // mencoba pop saat kosong

        myStack.push("Go");
        myStack.printStack();
    }
}
   

