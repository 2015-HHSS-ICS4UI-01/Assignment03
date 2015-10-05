/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise3 test = new Exercise3();
        int[] intArray = {2, 3, 1, 4, 6, 8, 9};
        test.bucketSort(intArray);
        String[] stringArray = {"aaaa", "abcd", "abbc", "aaab"};
        test.alphabeticalSort(stringArray);
        for (int x = 0; x < stringArray.length; x++) {
            //System.out.print(intArray[x] + ",");
            System.out.println(stringArray[x]);
        }
    }

    //sorts an array of strings in alphabetical order
    public void alphabeticalSort(String[] s) {
        for (int i = 1; i < s.length; i++) { //iterates through the string starting with the second number
            //if the second number comes before the first number alphabetically: 
            for (int j = i; j > 0 && s[j].compareToIgnoreCase(s[j-1]) < 0; j--) { 
                //switch the two words
                String temp = s[j];
                s[j] = s[j - 1];
                s[j - 1] = temp;
            }
        }
    }

    public void bucketSort(int[] n) {
        int[] tracker = new int[101];
        for (int x = 0; x < 101; x++) {
            for (int y = 0; y < n.length; y++) {
                if (n[y] == x) {
                    tracker[x]++;
                }
            }
        }
        int place = 0;
        for (int x = 0; x < tracker.length; x++) {
            if (tracker[x] > 0 && n.length >= x) {
                n[place] = x;
                place++;
            }
        }
    }

    public void descendingInsertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            for (int j = i; j > 0 && n[j] > n[j - 1]; j--) {
                int temp = n[j - 1];
                n[j - 1] = n[j];
                n[j] = temp;
            }
        }
    }
}
