/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        int[] n = {1, 2, 23, 2, 23, 23, 2, 12, 31, 23};
//        test.insertionSort(n);
        test.bucketSort(n);
        for (int x = 0; x < n.length; x++) {
            System.out.println(n[x]);
        }
    }

    public void insertionSort(int[] n) {
        for (int x = 1; x < n.length; x++) {
            int j = x;
            while (j > 0 && n[j] > n[j - 1]) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }

    public void bucketSort(int[] n) {
        int[] tracker = new int[101];
        for (int x = 0; x < n.length; x++) {
            tracker[n[x]]++;
        }
        int i = 0;
        for (int x = 0; x < tracker.length; x++) {
            if (tracker[x] != 0) {
                for (int y = 0; y < tracker[x]; y++) {
                    n[i] = x;
                    i++;
                }
            }
        }
    }
}
