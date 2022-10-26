/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidterm;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class T14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一字串:");
        String str = sc.nextLine();   
        System.out.println("There are " + str.length() + " characters");
    }
    
}
