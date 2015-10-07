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
        for(int i = 1; i < n.length; i++)
        {
            for(int j = i; j > 0 && n[j] < n[j - 1]; j--)
            {
                //swap
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
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
        
        //check if sorted by outputing values
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
    }
}
