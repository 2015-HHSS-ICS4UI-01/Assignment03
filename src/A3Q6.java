/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class A3Q6 {

    public void bucketSort(int[] n)
    {
        //create the tracker array
        int[] track = new int[101];
        //loop that uses each position of the array
        for(int i = 0; i < n.length; i++)
        {
            int value = n[i]; //create an integer to store the value in that postition`
            track[value]++; //increase the number at the values position by 1 in the tracker array
        }
        //loop to get the sorted values back into the initial array
        for(int i = 0; i < track.length; i++)
        {
             int count = 0;
             
             for(int j = 0; track[i] > j; j++)
             {
                 n[count] = i;
                 count++;
             }
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        
        //create the array and set the values
        int[] n = {24,5,13,3,5,19,9};
        
        //sort the array
        test.bucketSort(n);
        
        //check if sorted by outputing values in array order
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
    }
}
