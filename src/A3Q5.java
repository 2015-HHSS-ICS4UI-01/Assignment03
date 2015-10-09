/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A3Q5 {
    
    public void insertionSort(int[] n)
    {   
        //loop to run through each position in the array
        for(int i = 1; i < n.length; i++)
        {   
            //loop that runs pairs of numbers until the second number is smaller than the first number
            for(int j = i; j > 0 && n[j] > n[j - 1]; j--)
            {
                //every time the first number is bigger, swap the numbers
                int temp = n[j]; //store the second value in a temporary integer
                n[j] = n[j - 1]; //change the value of the second number with the first number
                n[j - 1] = temp; //change the value of the first number with the stored value
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        
        //create the array and set the values
        int[] n = {24,5,13,3,5,19,9};
        
        //sort the array
        test.insertionSort(n);
        
        //check if sorted by outputing values in array order
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
    }
}
