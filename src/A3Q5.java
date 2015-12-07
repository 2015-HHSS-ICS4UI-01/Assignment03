 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitin
 */
public class A3Q5 {

    /**
     * orders the number from greatest to smallest using insertion sort
     *
     * @param args the command line arguments
     */
    public void insertion(int[] n) {
        //runs the loop until goes thru all array
        for (int i = 0; i < n.length; i++) {
            //rearranges number from greatest to smallest
            for (int j = i; j > 0 && n[j] > n[j - 1]; j--) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        
        int[] n = {21, 10, 2, 2, 7, 15, 11, 10, 6,50};
        test.insertion(n);
        //prints array
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
