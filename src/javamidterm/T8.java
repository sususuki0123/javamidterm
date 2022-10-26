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
public class T8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("輸入第一行正整數為:");
        String num = sc.next();
        System.out.print("第二行中數列中的數字為:");
        String str = sc2.nextLine();
        String[] numstr = str.split(" ");
        String[] nums = new String[numstr.length];
        int total = 0;
        for(int i = 0; i < numstr.length; i ++) {
            nums[i] = (numstr[i]);
        }
        for(String n: nums) {
            if(n.contains(num)){
                total++;
            }
        }
        System.out.println("最大出現次數的數字為:"+total);
    }
    
}
