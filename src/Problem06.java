
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Problem06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int[] nums = new int[in.nextInt()];
        int[] tracker = new int[101];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            while (nums[i] > 100 || nums[i] < 0) {
                System.out.println("Try again: ");
                nums[i] = in.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < tracker.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            tracker[i] = count;
            count = 0;
        }
        for (int i = 0; i < tracker.length; i++) {
            while (tracker[i] > 0) {
                nums[count] = i;
                System.out.print(nums[count] + " ");
                count++;
                tracker[i]--;
            }
        }
        System.out.println();
    }
}
