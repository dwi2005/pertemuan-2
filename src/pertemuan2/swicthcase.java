/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author ADMIN
 */
public class swicthcase {
     public static void main(String[] args) {        
 

        
 

        char menu = '3';
 

        System.out.println("Menu Makanan : ");
 

        System.out.println("1. Nasi Goreng");
 

        System.out.println("2. Bakso");
 

        System.out.println("3. Mie Ayam");
 

        System.out.println("4. Sate");
 

        System.out.println("terimakasih snda memilih menu no : " + menu);
 

        
 

        switch(menu){
 

            case '1':
 

            System.out.println("Pilihan Anda : " + menu + ". Nasi Goreng (Rp.11.000)");
 

            break;
 

            case '2':
 

            System.out.println("Pilihan Anda : " + menu + ". Bakso (Rp.10.000)");
 

            break;
 

            case '3':
 

            System.out.println("Pilihan Anda : " + menu + ". Mie Ayam (Rp.10.000)");
 

            break;
 

            case '4':
 

            System.out.println("Pilihan Anda : " + menu + ". Sate (Rp.12.000)");
 

            break;
 

        }
 

    }
}
