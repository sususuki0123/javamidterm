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
public class T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("請輸入x軸y軸座標(以空白鍵隔開):");
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > 0 && y > 0){
            int cm1 = x*x + y*y;
            System.out.println("該點位於第一象限，離原點距離為根號" + cm1);
        }
        else if (x < 0 && y > 0){
            int cm2 = x*x + y*y;
            System.out.println("該點位於第二象限，離原點距離為根號" + cm2);
        }
        else if (x < 0 && y < 0){
            int cm3 = x*x + y*y;
            System.out.println("該點位於第三象限，離原點距離為根號" + cm3);
        }
        else if (x > 0 && y < 0){
            int cm4 = x*x + y*y;
            System.out.println("該點位於第四象限，離原點距離為根號" + cm4);
        }
        else if (x == 0 && y == 0){
            System.out.println("該點位於原點");
        }
        else if (x == 0 && y > 0){
            int cm5 = y*y;
            System.out.println("該點位於上半平面Y軸上，離原點距離為根號" + cm5);
        }
        else if (x == 0 && y < 0){
            int cm6 = y*y;
            System.out.println("該點位於下半平面Y軸上，離原點距離為根號" + cm6);
        }
        else if (x > 0 && y == 0){
            int cm7 = x*x;
            System.out.println("該點位於右半平面X軸上，離原點距離為根號" + cm7);
        }
        else if (x < 0 && y == 0){
            int cm8 = x*x;
            System.out.println("該點位於左半平面X軸上，離原點距離為根號" + cm8);
        }
        
    }
    
}
