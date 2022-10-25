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
public class T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入階層值M:");
        int m = sc.nextInt();
        int num = 1;
        int n = 1;
        while (num < m){
            num *= n;
            if (num < m){
                n += 1;
            }
        }
        System.out.println("超過M為" + m + "的最小階層N值為:" + n);
        
    }
    
}
