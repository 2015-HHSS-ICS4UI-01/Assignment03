/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class A3Q5 {

     public void insertionSort (int[] n)
    {
        for (int i = 1; i < n.length; i++)
        {
            for(int j = i; j>0 && n[j-1] < n[j]; j--)
            {
                int temp = n[j];
                n[j] = n[j-1];
                n[j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
         A3Q5 test = new A3Q5();
        int [] n = {24,7,56,45,32,1,33};
         test.insertionSort(n);
         for (int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
}
