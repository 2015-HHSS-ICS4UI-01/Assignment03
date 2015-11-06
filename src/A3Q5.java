/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author thomt9963
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input how many integers are in the array.");
        int s = input.nextInt();
        int p = 0;
        int l = 0;
        int[] n = new int[s];
        while (p < s) {
            System.out.println("Input the next integer");
            n[p] = input.nextInt();
            p++;
        }
        if (p == s) {
            System.out.println("");
            System.out.println("");
        }
        insertionSort(n);
        while (l < s) {
            System.out.print(n[l] + ", ");
            l++;
        }
        System.out.println("");
        System.out.println("");
    }

    static int[] insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            while (j > 0 && n[j - 1] < n[j]) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
        return n;
    }
}
