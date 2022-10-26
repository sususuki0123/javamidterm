/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidterm;
import java.util.Scanner;
import java.util.Arrays; 
/**
 *
 * @author user
 */
public class T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入值為:");
        String num = sc.next();
        String nc = num.replaceAll("\\p{Punct}", "");
        int len = nc.length();
        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(nc.substring(i, i+1));
        }

        int[] maxmin = new int[len];
        System.arraycopy(arr,0 , maxmin, 0, len);
        Arrays.sort(maxmin);

        int max = 0,min = 0;
        int count = 1;

        for(int j = 0; j < len; j++){
            max += maxmin[j] * count;
            count *= 10;
        }

        count = 1;

        for(int i = len - 1;i >= 0;i--){
            min += maxmin[i] * count;
            count *= 10;
        }

        System.out.println("最大值數列與最小值數列差值為:" + (max - min));
    }
    
}
