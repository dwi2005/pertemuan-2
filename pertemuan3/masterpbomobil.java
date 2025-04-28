/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ADMIN
 */
public class masterpbomobil {


    String karakteristik = "";

 

    String merk = "";
 

    String tahunPembuatan = "";
 

    
 

    void berjalan(String cepat){
 

        if(cepat == "normal"){
 

            System.out.println("Mobil sedang berjaan 25KM/JAM");
 

        }
 

        if(cepat == "lambat"){
 

            System.out.println("Mobil sedang berjaan 15KM/JAM");
 

        }
 

        if(cepat == "cepat"){
 

            System.out.println("Mobil sedang berjaan 150KM/JA<");
 

        }
 

    }
 

     void berhenti(){
 

        System.out.println("Mobil berhenti");
}
}
