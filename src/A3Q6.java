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
    
    public void bucketSort(int [] n,int x){
        int counter = 0;
       int[] tracker = new int[101];
        for(int i = 0; i < n.length; i++)
        {
            if(n[i] == x)
            {
                counter++;
            }
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        int x = 5;
        int[] n = {24,1,5,23,87,13,2};
        //sort array
        test.bucketSort(n,x);
        //check if sorted
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
    
}
