
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of words you want to type");
        int numberofwords = input.nextInt();//Length of array
        String [] words = new String [numberofwords];//Array that is the size determined by that was entered above
        System.out.println("Type the words you want to be sorted");
        input.nextLine();
        for (int i = 0; i< numberofwords; i++){
            words [i] = input.nextLine();//Array is filled with user inputed words
        }
        //Words in array are sorted alphabetically
        for(int i = 1; i<words.length; i++){
            for (int j = i; j>0 && words[j].compareTo(words[j-1]) < 0;j--){
                //Words are sorted
                String temp = words[j];
                words[j] = words[j-1];
                words[j-1] = temp;
            }   
        }
        System.out.println("");
        for (int i = 0; i < numberofwords; i++){
            System.out.println(words[i]+ "  ");//Sorted words are outputted
        }
        System.out.println("");
    }
}
