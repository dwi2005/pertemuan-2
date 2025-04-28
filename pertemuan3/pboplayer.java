/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ADMIN
 */
public class pboplayer {
    
    public static void main(String[] args) {
    
       // PLAYER PENYERANG

 

        masterpboplayer kuli = new masterpboplayer();
 

        kuli.nama = "Bambang Santoso";
 

        kuli.speed = 200;
 

        kuli.attack = 10;
 

        kuli.healthPoint = 100;
 

        
 

        // PLAYER YANG DISERANG
 

        masterpboplayer petani = new masterpboplayer();
 

        petani.nama = "Jaya";
 

        petani.speed = 200;
 

        petani.healthPoint = 100; 
 

        
 

        kuli.runPlayer();
 

        System.out.println("Serang ");
 

        petani.healthPoint = kuli.serangLawan(kuli.attack, petani.healthPoint);
 

        
 

       
 

        // serang lagi
 

        System.out.println("Serang lagi");
 

        kuli.attack = 50;
 

        kuli.healthPoint = 100;
 

        petani.healthPoint = kuli.serangLawan(kuli.attack, petani.healthPoint);
 

        
 

        // serang lagi
 

        System.out.println("Serang ultimatum");
 

        kuli.attack = 100;
 

        kuli.healthPoint = 100;
 

        petani.healthPoint = kuli.serangLawan(kuli.attack, petani.healthPoint);
 

        
 

        if(kuli.isDead()){
 

            System.out.println("Babbang menang : Game Over");
 

        }
 

    }
}
