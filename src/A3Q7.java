
import java.util.Arrays;
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

        String[] word = new String[n];
        input.nextLine();
        System.out.println("Input your words to be sorted.");
        for (int i = 0; i < n; i++) {
            word[i] = input.nextLine();
        }

        insertionSort(word);
        System.out.println(Arrays.toString(word));

    }

    static String insertionSort(String[] word) {
        for (int i = 1; i < word.length; i++) {
            int k = i;
            if (word[k].compareTo(word[k - 1]) < 0 && k > 0) {
                String temp = word[k];
                word[k] = word[k - 1];
                word[k - 1] = temp;
                k--;
            }
        }
        return null;
    }
}
