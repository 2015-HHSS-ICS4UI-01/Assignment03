/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Question6 {
    
    public void bucketSort(int[] n){
        //initializes array for tracking the number of times a number appears
        int[] tracker = new int[101];
        //loop through array tracker until all numbers are assigned a 0
        for(int i = 0; i <= n.length; i++){
            
            tracker[i] = 0;
        }
        
        //loop through every number of the array
        for(int i = 0; i <= n.length; i++)
        {
            if(n[i] == tracker[n[i]])
            tracker[n[i]] = tracker[n[i]] + 1;
        }
        
        for(int i = 0; i <= tracker.length; i++)
        {
            for(int j = 0; j < tracker[i]; j++)
            {
                System.out.println(String.valueOf(tracker[i]));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] n = {35, 74, 19};
        
        Question6 test = new Question6();
        
        //test.bucketSort(n);
    }
}
