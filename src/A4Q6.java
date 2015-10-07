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
    }

    static int bucketSort(int[] a) {
        //take the array and check every number
        //check each number with every number i have seen before
        //if they are equal add one to it's respective counter
        int num = 0;
        int count = 0;
        while (num <= 100) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == num){
                    count++;
                }
            }
            System.out.println("for " + num + "there was " + count + " of them.");
            num++;
            count = 0;
        }
    }
}
