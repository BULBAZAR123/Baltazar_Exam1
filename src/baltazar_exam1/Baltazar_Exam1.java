/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baltazar_exam1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Baltazar_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALL HERE FOR TESTING
    }
    
    public static void no1(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Integer: ");
        int num = scn.nextInt();
        int[] arr = new int [num];
        
        for (int i = 0; i < 6; i++) {
            arr[i] = scn.nextInt();
        }
    }
    
    public static void no2(){
        String[] origFruits = {"banana","apple", "lanzones", "durian", "rambotan", "kiwi", "mansanitas"};
        System.out.println("Orig Fruits: " + origFruits);
       
        int n = origFruits.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (origFruits[j] > origFruits[j + 1]) {
                    String m = origFruits[j];
                    origFruits[j] = origFruits[j + 1];
                    origFruits[j + 1] = m;
                }
            }
                
        }
    }
    
    public static void no3(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = scn.nextInt();
        int[] myArray = new int[length];
        
        System.out.println("myArray's length: " + length); 
       // System.out.println("Arrays: " + Arrays.toString(myArray));
    }
    
    public static void no4(){
        int[] allNum = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] positiveEvenNumbers = new int[20];
        for (int i = 2; i < 20; i++) {
            allNum[i] = positiveEvenNumbers[i];
        }
        System.out.println("dman" + Arrays.toString(positiveEvenNumbers));
    }
    
    public static void no5(){
       Scanner scn = new Scanner(System.in);
        System.out.println("Input Your Fibonacci Numbers: ");
        int num = scn.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.println(fiboboy(i) + " ");
        }
        
    }
    public static int fiboboy(int n){
        if(n  == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return fiboboy(n - 1) + fiboboy (n - 2);
        }
    }
    
}
