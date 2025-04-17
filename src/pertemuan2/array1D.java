/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author ADMIN
 */
public class array1D {
    
    
     public static void main(String[] args) {
 

        String[] barang = {"Sabun Wajah", "Parfum", "Deodorant", "Pomade", "Skin Care\n\n"};
 

        System.out.println("Daftar produk toko : ");
 

        for(int i = 0; i<barang.length; i++){
 

            System.out.println((i+1) + ". " + barang[i]);
 

        }
 

    }
}
