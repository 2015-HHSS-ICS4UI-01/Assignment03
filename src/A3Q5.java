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
        int[] n = {10,9,8,7,6,5,4,3,2,1,1,1,1,1,1,1,11};
        String[] words = {"abcdefg","abcdeff"};
//        test.insertionSort(n);
        test.stringSort(words);
        for (int x = 0; x < words.length; x++) {
            System.out.println(words[x]);
        }
    }

    public void insertionSortDescendign(int[] n) {
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

    public void stringSort(String[] words) {
        for (int x = 1; x < words.length; x++) {
            for (int i = x; i > 0 && words[i].compareToIgnoreCase(words[i - 1]) < 0; i--) {
                String temp = words[i];
                words[i] = words[i - 1];
                words[i - 1] = temp;
            }
        }
    }
}
