/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vize_final;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Vize_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner veri=new Scanner (System.in);
        System.out.print("vize notunuz:");
        double vize_not=veri.nextDouble();
        System.out.print("\nfinal notunuz:");
        double final_not=veri.nextDouble();
        double ort=(vize_not*0.4)+(final_not*0.6);
        if(final_not>=50 && ort>=50)
            System.out.print("Geçtiniz");
        else 
            System.out.print("Kaldınız");
    }
    
}
