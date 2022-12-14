/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Hp
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Ketua ketua = new Ketua("21090086","Kristof Vandel Nopwan Zega","Laki-Laki",2021,3);
    Kaprodi kaprodi = new Kaprodi ("12345678","Eriansyah","Laki-laki","RPL");
    
    ketua.viewDosen();
    ketua.viewKetua();
    
    kaprodi.viewDosen();
    kaprodi.viewKaprodi();
    }
    
}
