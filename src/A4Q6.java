
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] hundy = new int [50];
        for (int i = 0; i < hundy.length; i++){
            hundy[i] = (int)(Math.random()*101);
        }
        bucketSort(hundy);
        
        for(int i = 0; i < hundy.length; i++){
            System.out.println(hundy[i]);
        }
    }

    static void bucketSort(int[] a) {
        //take the array and check every number
        //check each number with every number i have seen before
        //if they are equal add one to it's respective counter
        
        //the number thats being checked
        int num = 0;
        
        //temp array
        int[] temp = new int[a.length];
        int tempCount = 0;
        
        //checking every number up to and including 100
        while (num <= 100) {
            //seeing if the number at [i] is the current number we are looking for
            for (int i = 0; i < a.length; i++) {
                if (a[i] == num){
                    temp[tempCount] = num;
                    tempCount++;
                }
            }
            //moving to the next number
            num++;
        }
        
        for(int i = 0; i < temp.length; i++){
            a[i] = temp[i];
        }
        

    }
}
