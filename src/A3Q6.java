

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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Input array length.");
        int s = input.nextInt();
        int[] n = new int[s];
        while (i < n.length) {
            n[i] = input.nextInt();
            i++;
        }
        for (int p = 0; p < n.length; p++) {
            System.out.print(n[p]);
            System.out.print(" ");
        }
        bucketSort(n);
        System.out.println("");
        System.out.println(Arrays.toString(n));
    }

    static int[] bucketSort(int[] n) {
        int[] tracker = new int[101];

        for (int i = 0; i < tracker.length; i++) {
            tracker[i] = 0;
        }
        
        for (int i = 0; i < n.length; i++) {
            tracker[n[i]]++;
        }
        
        int k = 0;
        for (int i = 0; i < tracker.length; i++) {
            for (int j = 0; j < tracker[i]; j++) {
                n[k++] = i;
            }
        }
        return null;
    }
}
