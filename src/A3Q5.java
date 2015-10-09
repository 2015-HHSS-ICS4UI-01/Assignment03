
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
        int [] n = {60,8,32,1,45,78,34,7};//n array with values    
//        test.insertionSort(n);//sort the numbers
        test.insertionSort(n);
        
        for (int i = 0; i < n.length; i++) {// i will equal the length of the array
            System.out.println(n[i]);//print out each number
        }
        
    }
   public void insertionSort(int[] n){
   for(int i = 1; i < n.length; i++)//will run the whole length of th array
   {
      int j = i;//j is equal to the curret i value
      while(j>0 && n[j-1] < n[j])//while we have a number to sort j will be an array number
      {
         int temp = n[j];//this will be a temp number with the value of what ever j is
         n[j] = n[j-1]; //spot j will equal spot j - 1
         n[j-1] = temp; //spot j will equal the temp number
         j--; // subtract 1 from j 
      }
   }
   
}
   
}
