/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ADMIN
 */
public class pbobangundatar {
    public static void main(String[] args) {
        masterpbobangundatar Lingkaran = new masterpbobangundatar();
        Lingkaran.luas = Lingkaran.phi*Lingkaran.r*Lingkaran.r;
        System.out.println("Luas Lingkaran dari jari jari : " + Lingkaran.r + " Adalah " + Lingkaran.luas);
        
        masterpbobangundatar Segitiga = new masterpbobangundatar();
        Segitiga.luasSGT = (1.0/2)*Segitiga.alas*Segitiga.tinggi;
        System.out.println("Luas Segitiga Dengan Tinggi : " + Segitiga.tinggi + "dan Alas : " + Segitiga.alas + " Adalah " + Segitiga.luasSGT);
        
    }
}
