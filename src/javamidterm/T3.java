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
public class T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入西元年:");
        int year = scanner.nextInt();
        int m = year % 12;
        if (year % 12 == 4){
            System.out.println("Rat");
        }
        else if (year % 12 == 5){
            System.out.println("Ox");
        }
        else if (year % 12 == 6){
            System.out.println("Tiger");
        }
        else if (year % 12 == 7){
            System.out.println("Rabbit");
        }
        else if (year % 12 == 8){
            System.out.println("Dragon");
        }
        else if (year % 12  == 9){
            System.out.println("Snake");
        }
        else if (year % 12 == 10){
            System.out.println("Horse");
        }
        else if (year % 12 == 11){
            System.out.println("Goat");
        }
        else if (year % 12 == 0){
            System.out.println("Monkey");
        }
        else if (year % 12 == 1){
            System.out.println("Rooster");
        }
        else if (year % 12 == 2){
            System.out.println("Dog");
        }
        else if (year % 12 == 3){
            System.out.println("Pig");
        }
        
    }
    
}
