/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class A3Q5 {
public void insertionsort(int[]n){
        for(int i = 1; i<n.length; i++){
            for(int j = i; j>0 && n[j-1] < n[j]; j--){
             int temp = n[j];
             n[j] = n[j-1];
             n[j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        int[] n = {124,7,56,45,32,9,3,709,90,0};
        test.insertionsort(n);
         for(int i = 0; i <n.length; i++)
         {
             System.out.println(n[i]);
         }
    }
}
