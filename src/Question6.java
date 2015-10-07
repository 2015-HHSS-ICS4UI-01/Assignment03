/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Question6 {
    
    public void initializeArray(int[] n){
        
        for(int i = 0; i < n.length; i++){
            n[i] = (int)(Math.random()*101);
        }
    }
    
    public void bucketSort(int[] n){
        //initializes array for tracking the number of times a number appears
        int[] tracker = new int[101];
        //loop through array tracker until all numbers are 0
        for(int i = 0; i < tracker.length; i++){
            
            tracker[i] = 0;
        }
        
        //loop through every number of the array of numbers to be sorted
        //in the tracker array, increase each position's number by one for every time the corresponding number appears in the number set
        for(int i = 0; i < n.length; i++)
        {
            tracker[n[i]]++;
        }
        
        //initializes variable to track the position of the set of numbers
        int numPos = 0;
        //loop through the tracker until all numbers have been seen
        for(int i = 0; i < tracker.length; i++)
        {
            //until variable j is equal to or greater to tracker at variable i
            //set the number at that position of the set of numbers to the value of variable i
            for(int j = 0; j < tracker[i]; j++)
            {
                n[numPos] = i;
                numPos++;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] n = new int[101];
        
        Question6 test = new Question6();
        
        //assign numbers to the array
        test.initializeArray(n);
        //sort the set of numbers
        test.bucketSort(n);
        
        //print out the sorted array
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
}
