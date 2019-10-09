/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Mengeja Nama
 */
public class PBO110118032Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama depan anda untuk dieja : ");
	Scanner sc = new Scanner(System.in);
	String namaLengkap = sc.next();
	System.out.println("Ejaan untuk \"" + namaLengkap + "\" adalah : ");
	for(int i = 0; i < namaLengkap.length(); i ++)
		System.out.println("Huruf ke-" + (i+1) + " : " + namaLengkap.charAt(i));
    }
    
}
