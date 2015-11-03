
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class A3Q7 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words would you like to be sorted");
        int length = input.nextInt(); //The length of the array that it needs to be
        length = length + 1; // Added one to fix issue where user would only  be allowed to enter one less that what they wanted
        String[] word = new String[length];
        
        System.out.println("Please enter the words to be sorted");
        for(int i = 0; i < length ;i++){//Filling the array with the needed amount of words 
            word[i] = input.nextLine();
        }
        //The for loops are needed to compare the words and swap them if needed
        for(int i =1; i < word.length;i++){
            for(int j = i; j>0 && word[j].compareTo(word[j-1]) < 0; j--){ // If the word a spot j is lower than spot j - 1, then they will switch postions
                //Switching of the words 
                String tmep = word[j];
                word[j] = word[j-1];
                word[j-1] = tmep;
            } 
        }
        //Reposting out the words is the now sorted order
        System.out.println("");
        for(int i = 0; i < length; i++){
            System.out.println(word[i] + " ");
           
        }
        System.out.println("");
        
        
        
    }
}
