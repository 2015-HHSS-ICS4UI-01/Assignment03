/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Assignment3 test = new Assignment3();
        int[] n = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 1, 1, 1, 1, 1, 11};
        String[] words = {"abcde", "abcdd"};
//        test.insertionSort(n);
        test.stringSort(words);
        for (int x = 0; x < words.length; x++) {
            System.out.println(words[x]);
        }
    }

    /**
     * Sorts an array of integers from greatest to least
     *
     * @param n numbers to be sorted
     */
    public void insertionSortDescending(int[] n) {
        for (int x = 1; x < n.length; x++) { //runs through positions in the array
            int j = x; //start at whatever x value is, and continue decreasing until it's sorted
            while (j > 0 && n[j] > n[j - 1]) { //while the number before n[j] is less than n[j]
                //swap numbers
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--; //continue decreasing until it reaches part that is sorted
            }
        }
    }

    /**
     * Sorts an array of numbers from least to greatest using the bucket sort
     * method
     *
     * @param n numbers to be sorted
     */
    public void bucketSort(int[] n) {
        int[] tracker = new int[101]; //tracker array to keep track of how many times a number has been used
        for (int x = 0; x < n.length; x++) { //for every spot in the array
            tracker[n[x]]++; //the spot in the tracker array that corresponds to the number at n[x] is increased by 1 
        }
        int i = 0; //to show a spot in the array in the following for loop
        for (int x = 0; x < tracker.length; x++) { //for every spot in the tracker array
            if (tracker[x] != 0) { //if the number wasn't used at all..(i realize it's null, but i still like putting it in for clarity)
                for (int y = 0; y < tracker[x]; y++) { //for the amount of times the number at x is used
                    n[i] = x; //sort the array
                    i++;
                }
            }
        }
    }

    /**
     * Sort words alphabetically
     *
     * @param words words to be sorted
     */
    public void stringSort(String[] words) {
        for (int x = 1; x < words.length; x++) { //runs through every word in the array
            for (int i = x; i > 0 && words[i].compareToIgnoreCase(words[i - 1]) < 0; i--) { //if the word before words[i] is after it in the alphabet
                //swap words
                String temp = words[i];
                words[i] = words[i - 1];
                words[i - 1] = temp;
            }
        }
    }
}
