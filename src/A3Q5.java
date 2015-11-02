
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public void insertionSort(int[] n){
        for(int i = 1; i<n.length; i++){                //go through the array
            for(int j = i; j>0 && n[j] > n[j-1]; j--){  //go through and find spot
                                                        //down the array
                int temp = n[j];                        //switch if found
                n[j] = n[j-1];
                n[j-1] = temp;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A3Q5 test = new A3Q5();
        int[] n = new int[input.nextInt()];
        for(int i = 0; i<n.length; i++){
            n[i] = input.nextInt();
        }
        test.insertionSort(n);
        for(int i = 0; i<n.length; i++){
            System.out.println(n[i]);
        }
    }
}
