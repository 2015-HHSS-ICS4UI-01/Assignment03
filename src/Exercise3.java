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
        String[] stringArray = {"aaaa", "abcd", "acbc", "aaab"};
        test.alphabeticalSort(stringArray);
        for (int x = 0; x < stringArray.length; x++) {
            //System.out.print(intArray[x] + ",");
            System.out.println(stringArray[x]);
        }
    }

    //sorts an array of strings in alphabetical order
    public void alphabeticalSort(String[] s) {
        for (int i = 1; i < s.length; i++) { //iterates through the string starting with the second number

            for (int j = i; j > 0 && s[j].compareToIgnoreCase(s[j - 1]) < 0; j--) { //loop when the second word comes before the first number alphabetically: 
                //switch the two words
                String temp = s[j];
                s[j] = s[j - 1];
                s[j - 1] = temp;
            }
        }
    }

    //sorts integer arrays that contain numbers between 0 and 100
    public void bucketSort(int[] n) {
        int[] tracker = new int[101]; //declare tracker array that contains a spot for every number 0-100
        for (int x = 0; x < 101; x++) { //iterate through every number between 0 and 100
            for (int y = 0; y < n.length; y++) { //iterate through the array passed through the method
                if (n[y] == x) { //if the number at the selected spot of the array is a number x between 0 and 100
                    tracker[x]++; //increment the occurence of the number x within the tracker array.
                }
            }
        }
        int place = 0; //holds the current index of the new sorted array.
        for (int x = 0; x < tracker.length; x++) { //iterate through the tracker array
            if (tracker[x] > 0 && n.length >= x) { //if a number occurs at least once
                n[place] = x; //the first spot at the new sorted array is the number that occurs in the tracker array
                place++; //increment to the next spot of the new sorted array
            }
        }
    }

    //sorts integer arrays in descending order
    public void descendingInsertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) { //start with the second number in the array
            for (int j = i; j > 0 && n[j] > n[j - 1]; j--) { //if the second number is greater than the first number
                //switch the numbers
                int temp = n[j - 1];
                n[j - 1] = n[j];
                n[j] = temp;
            }
        }
    }
}
