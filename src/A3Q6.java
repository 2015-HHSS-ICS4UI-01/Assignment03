/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class A3Q6 {
    public void bucketSort(int[] n){
        //initialize the tracker array
        int[] tracker = new int[101];
        //go through the tracker array and assign all spots a 0
        for (int i = 0; i < tracker.length; i++) {
            tracker[i] = 0;
        }
        
        //go through and count how many times one number is encountered
        for (int i = 0; i < n.length; i++) {
            tracker[n[i]]++;
        }
        //delcare variable
        int num = 0;
        //go through the tracker array
        for (int i = 0; i < tracker.length; i++) {
            //if i occurs,  then the first number in the array is i. If it occurs again, the next number is i too.
            for (int j = 0; j < tracker[i]; j++) {
                n[num] = i;
                num++;
            }
        }
        
     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = {4, 2, 1, 3, 5, 4,};
        
        A3Q6 test = new A3Q6();
        test.bucketSort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
       
    }
    //This method isn't very useful because it makes many comparisons.
    //The amount of comparisons it makes are much more than the ones of other methods.
}
