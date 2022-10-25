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
public class T2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);//宣告Scanner物件
            System.out.print("請輸入數字:"); //提示使用者輸入數字
            
            double tmp;
            int num = sc.nextInt();    
            if (num <=120) {
                tmp = num*2.10f;
                System.out.println("Summer months:"+tmp);
                System.out.println("Non-Summer months:"+tmp);
            } 
            else if (num >120 && num <=330) {
                tmp =120*2.10f+(num-120)*3.02f;
                System.out.println("Summer months:"+tmp);
                tmp =120*2.10f+(num-120)*2.68f;
                System.out.println("Non-Summer months::"+tmp);
            } 
            else if (num >330 && num <=500) {
                    tmp = 120*2.10f+210*3.02f+(num-330)*4.39f;
                    System.out.println("Summer months:"+tmp);
                    tmp = 120*2.10f+210*2.68f+(num-330)*3.61f;
                    System.out.println("Non-Summer months:"+tmp);
            } 
            else if (num >500 && num <=700) {
                tmp = 120*2.10f+210*3.02f+170*4.39f+(num-500)*4.97f;
                System.out.println("Summer months:"+tmp);
                tmp = 120*2.10f+210*2.68f+170*3.61f+(num-500)*4.01f;
                System.out.println("Non-Summer months:"+tmp);
            }
            else {
                tmp = 120*2.10f+210*3.02f+170*4.39f+200*4.97f+(num-700)*5.63f;
                System.out.println("Summer months:"+tmp);
                tmp = 120*2.10f+210*2.68f+170*3.61f+200*4.01f+(num-700)*4.50f;
                System.out.println("Non-Summer months:"+tmp);
            }

        }
        
}
