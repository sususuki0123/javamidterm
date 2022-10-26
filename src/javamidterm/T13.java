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
public class T13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一字元為:");
        String str = sc.next();   
        StringBuilder str2 = new StringBuilder(str);
        String str3;
        str3 = str2.reverse().toString();
        
        if(str.contains(str3)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
