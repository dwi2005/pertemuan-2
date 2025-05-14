/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ADMIN
 */
public class manualqueue {
    
    private int[] queue;
    private int front, rear, size, capacity;

    // Konstruktor untuk inisialisasi antrian
    public manualqueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Mengecek apakah antrian penuh
    public boolean isFull() {
        return size == capacity;
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Menambahkan elemen ke antrian
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan elemen: " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Menambahkan elemen: " + item);
    }

    // Menghapus elemen dari antrian
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak dapat menghapus elemen.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Menghapus elemen: " + item);
        return item;
    }

    // Menampilkan elemen dalam antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.print("Elemen dalam antrian: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        manualqueue q = new manualqueue(5);

        q.dequeue(); // Antrian kosong

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.enqueue(60); // Antrian penuh

        q.display();

        q.dequeue();
        q.display();
    }
}

