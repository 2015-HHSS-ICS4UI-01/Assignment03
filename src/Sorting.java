
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
        
        
        //Problem 5
        System.out.print("Array length: ");
        int[] nums = new int[in.nextInt()];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        
        
        
        
        //Problem 6
        System.out.print("Array length: ");
        nums = new int[in.nextInt()];
        int[] tracker = new int[101];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            while (nums[i] > 100 || nums[i] < 0) {
                System.out.println("Try again: ");
                nums[i] = in.nextInt();
            }
        }
        for (int i = 0; i < tracker.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            tracker[i] = count;
        }
        for (int i = 0; i < tracker.length; i++) {
            while (tracker[i] > 0) {
                System.out.print(i + " ");
                tracker[i]--;
            }
        }
        System.out.println();
        
        
        
        
        
        //Problem 7
        
    }
}
