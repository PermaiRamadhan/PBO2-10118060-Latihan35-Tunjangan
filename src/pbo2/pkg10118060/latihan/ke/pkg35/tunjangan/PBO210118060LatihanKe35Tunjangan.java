/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg35.tunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Permai Ramadhan
 * NIM  :10118060
 */
public class PBO210118060LatihanKe35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan = new Karyawan();
        System.out.println("========================== Program Tunjangan ==========================");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: Rp. ");
        Scanner gp = new Scanner(System.in);
        karyawan.setGajiPokok(gp.nextDouble());
       
        System.out.print("Status Anda ? (Menikah/Belum)\t\t:  ");
        Scanner Sstat = new Scanner(System.in);
        //String Status = Sstat.next();
        karyawan.setStatus(Sstat.next().toUpperCase());
        System.out.println("");
        karyawan.HasilHitung();
        System.out.println("");
        System.out.println("Developed By : Permai Ramadhan");
    }
    
}
