/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    
      public void insertionSort(int[]n)
    {
         for(int i = 0; i < n.length; i++)
         {
             for(int j = i; j > 0 && n[j] > n[j-1];j--)
             {
                 int temp = n[j];
                 n[j] = n[j-1];
                 n[j-1] = temp;
             }
         }
    }
     
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        int[] n = {24,1,5,23,87,13,2,325,252464,2394037};
        //sort array
        test.insertionSort(n);
        //check if sorted
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
    }
    

