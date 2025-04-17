/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author ADMIN
 */

import java.util.Random;


public class while_ {
    
    
    static int gaca =0;
 

    static int hasil;
 

    
 

    @SuppressWarnings("empty-statement")
 

    public static void main(String[] args) {
 

       
 

        System.out.println("Undian Kupon Gratis......");
 

        String[] kupon = {"Diskon 20 %", "2. coba lagi", "3. coba lagi", "Makan Gratis", "4. coba lagi", "5. coba lagi", "Minum Gratis"};
 

        Random rand = new Random();
 

        while(gaca <= 50){
 

            hasil = rand.nextInt(7);
 

            System.out.println("Gaca Kupon Anda : " + kupon[hasil]);
 

            gaca++;
 

        }
 

        System.out.println("-----------------------------------------------------------------------------------");
 

        System.out.println("Anda dapat  kupon : " + kupon[hasil]);
 

        System.out.println("-----------------------------------------------------------------------------------");
 

    }
}
