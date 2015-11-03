/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class A3Q6 {

    public void bucketsort(int [] n)
    {
       int bucketsort [] = new int [101];       //array for the buckets
       
       for (int i = 0; i < bucketsort.length; i++)
       {
           bucketsort[i] = 0;                   //every position in the array is set to zero
       }
       
       for (int i =0; i < n.length; i++)
       {
           bucketsort[n[i]]++;    //if a number in n is found in bucketsort, +1 is added to that position
       }
       
       
       int c = 0;
       for (int i = 0; i <bucketsort.length; i++)       //The buckets are emptied and sorted
       {
           for (int p  = 0; p < bucketsort[i]; p++)
           {
               n[c] = i;
               c++;             //1 is added to counter to continue through the numbers
           }
       }
       
    }
    
    
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        int b = 100;
        int[] nums = new int[b];
        for(int i = 0; i < b; i++){
            nums[i] = (int)(Math.random()*101);
        }
        
        test.bucketsort(nums);
        for(int i = 0; i < b; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
