

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomt9963
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you be inputing?");
        int n = input.nextInt();
        int i = 0;
        String [] word = new String [n];
        while (i < word.length) {
            word[i] = input.nextLine();
            i++;
        }
        insertionSort(word);
        
    }
    static String insertionSort(String[] word){
        for (int i = 0; i < word.length; i++) {
            while(int k = 0; word[k].compareTo(word[k-1]) < 0; k++){

                
            }
            
        }
        return null;
   
}
}
