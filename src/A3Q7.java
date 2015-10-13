/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author kampn2687
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of words in the array");
        int aLength = in.nextInt();
        String [] words = new String [aLength];
        in.nextLine();
        System.out.println("enter words to be sorted");
        for( int i = 0; i < aLength; i++ ){
            words[i] = in.nextLine();
        }
        for(int i = 1; i < words.length; i ++){
            for(int j = i; j > 0 && words[j].compareTo(words[j-1]) < 0; j--){
                //swap
                String temp = words[j];
                words[j]= words[j - 1];
                words[j - 1] = temp;
            }
        }
        for(int i = 0; i  < aLength; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println("");
    }
}
