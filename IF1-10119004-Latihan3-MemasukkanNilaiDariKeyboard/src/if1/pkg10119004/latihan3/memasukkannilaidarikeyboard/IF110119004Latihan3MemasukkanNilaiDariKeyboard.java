/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan3.memasukkannilaidarikeyboard;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * NAMA     : Muhamad Ramadan
 * KELAS    : IF 1
 * NIM      : 10119004
 * Deskripsi Program : Program ini berisi tentang memasukkan nilai dari keyboard
 */
public class IF110119004Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
