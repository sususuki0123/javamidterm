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
public class T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("輸入s1為:");
        System.out.print("\n");
        System.out.println("輸入s2為:");
        String s1 = sc.nextLine();
        String s2 = sc2.nextLine();
        if(s2.contains(s1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
