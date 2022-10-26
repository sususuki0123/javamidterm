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
public class T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入月租費型式及通話時間為:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 186){
            b *= 0.09;
            if (b >= a && b < 2*a){
                b *= 0.9;
            }
            else if (b >= 2*a){
                b*=0.8;
            }
        }  
        else if (a == 386){
            b *= 0.08;
            System.out.println("通話費為:" + b);
            if (b >= a && b < 2*a){
                b*=0.8;
            }
            else if (b >= 2*a){
                b*=0.7;
            }
        }
        else if (a == 586){
            b *= 0.07;
            if(b >= a && b < 2*a){
                b *= 0.7;
            }
            else if (b >= 2*a){
                b *= 0.6;
            }
        }
        else if (a == 986){
            b *= 0.06;
            if (b >= a && b < 2*a){
                b *= 0.6;
            }
            else if (b >= 2*a){
                b *= 0.5;
            }
        }
    System.out.println("通話費為:"+b);
    }
}
