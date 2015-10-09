
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        A3Q5 test = new A3Q5();
        
    }
   public void insertionSort(int[] n){
   for(int i = 1; i < n.length; i++)
   {
      int j = i;
      while(j>0 && n[j-1] < n[j])
      {
         int temp = n[j];
         n[j] = n[j-1];
         n[j-1] = temp;
         j--;
      }
   }
}
}
