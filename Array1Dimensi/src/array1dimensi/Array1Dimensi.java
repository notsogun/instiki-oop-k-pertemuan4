/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author Gunawiartha
 * TGL 12 April 2025
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0] = "Yinari Dewi";
        nama[1] = "Bambang";
        nama[2] = "Santika";
        nama[3] = "Budi Utomo";
        nama[4] = "Capucino Assasina";
       
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++ ){
            System.out.print("Data Teman ke-"+String.valueOf(idx+1)+": "); //Integer.toString()
            nama[idx] = inp.nextLine();
        }
        
        String NamaTeman = nama[3];
        System.out.printf("Data Teman: %s\n", nama[2]);
        
        
        for(int idx=0; idx<5; idx++ ){
            System.out.println("Teman ke-" +(idx+1)+": "+nama[idx]);
        }
        
        //foreach
        for(String nm : nama){
            System.out.println(nm);
        }
        
    }
    
}
