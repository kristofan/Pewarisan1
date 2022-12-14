/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihaninheritance;

/**
 *
 * @author Hp
 */
public class Latihaninheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang a= new PersegiPanjang();
        a.setPanjang(5);
        a.setLebar(2);
        System.out.println("");
        System.out.println("Contoh program pewarisan");
        System.out.println("");
        System.out.println("superclass persegi panjang");
        System.out.println("panjang :"+a.getPanjang());
        System.out.println("lebar  :"+a.getLebar());
        System.out.println("luas :"+a.Luas());
        System.out.println("");
        Balok b= new Balok();
        
        
        b.setPanjang(6);
        b.setLebar(3);
        b.setTinggi(5);
        System.out.println("Subclass Balok");
        System.out.println(" Panjang : "+b.getPanjang());
        System.out.println(" Lebar : "+b.getLebar());
        System.out.println(" Tinggi : "+b.getTinggi());
        System.out.println(" Volume : "+b.Volume());
    }
    
}
