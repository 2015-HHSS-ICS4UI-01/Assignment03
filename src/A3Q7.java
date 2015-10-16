
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janaj4926
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String [] a = new String [5];
        
        System.out.println("enter words");
        for(int i = 0; i < a.length; i++){
            System.out.print(": ");
        }
        
        wordInsertionSort(a);
    }
    
    public void wordInsertionSort(String[] words){
        String temp = "";
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].compareTo(words[i]) > 0) {
                temp = words[i];
                words[i] = words[i - 1];
                words[i - 1] = temp;
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ", ");
        }
    }
}
