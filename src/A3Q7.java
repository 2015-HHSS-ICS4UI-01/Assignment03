/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alimu
 */
public class A3Q7 {
    
public void insertionSort(String[]n)
    {
        //go through the array of strings
        for (int i = 0; i < n.length ; i++) {
            //compare 2 strings, and if it returns a negative (less than 0) its out of order 
            for(int j = i; j > 0 && n[j].compareTo(n[j-1]) < 0;j--)
             {
                 //store the string and swap
                String temp = n[j]; 
                 n[j] = n[j-1];
                 n[j-1] = temp;
        }
    }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        String[] n = {"computer","science","is","fun"};
        test.insertionSort(n);
       
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
        
    }
    
}
