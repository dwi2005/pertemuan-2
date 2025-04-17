/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author ADMIN
 */
public class array2D {
    
    
    
     public static void main(String[] args) {  
 

        int[][] nilai = {
 

            {85, 75, 90}, 
 

            {78, 88, 80},
 

            {92, 91, 70}  
 

        };
 

        
 

        String[]matkul ={"ASWAJA", "Nahwu", "Sorof"};
 

        for(int siswa = 0; siswa<nilai.length; siswa++){
 

            System.out.println("Siswa ke 0" + (siswa+1) + ": ");
 

            for(int i= 0; i<nilai[siswa].length; i++){
 

                System.out.println("  " + matkul[i] + ": " + nilai[siswa][i]);
 

            }
 

            
 

        }
 

    }
}
