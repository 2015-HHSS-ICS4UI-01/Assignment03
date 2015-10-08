/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morgennebesenschek
 */
public class Question5 {
    
    public void insertionSort(int[] n){
      
        //loop through the array until all numbers are sorted
        for(int i = 1; i < n.length; i++)
        {
            
            //set variable j equal to i
            int j = i;
            
            //if number at j-1 is greater than number at j
            //counts down from j and swaps j with the number before it
            //until number at j is in the correct position
            while(j > 0 && n[j-1] < n[j])
            {
              //assign number at position j to a temporary variable
              int temp = n[j];
              //set number at position j to number at position j-1
              n[j] = n[j-1];
              //set number at position j-1 to the original value of int at position j
              n[j-1] = temp;

              j--;
            }
        }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creates an array for testing the sorting algorithm
        int[] n = {25,30,20,80,40,60};
        
        Question5 test = new Question5();
        
        //sorts the numbers in the array
        test.insertionSort(n);
        
        //prints the sorted numbers to the screen
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
        
    }
    
}
