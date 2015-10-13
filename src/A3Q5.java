/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author kampn2687
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //question 1
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array length");
        int [] iSort = new int [in.nextInt()];
        System.out.println("enter " + iSort.length + " numbers to be sorted");
        for(int i=0; i < iSort.length; i++ ){
            iSort[i] = in.nextInt();
        }
        insertionSort(iSort);
        for(int i = 0; i < iSort.length; i++){
            System.out.print(iSort[i]+" " );
        }
        System.out.println();
        
        
         
        
    } 
    static int[] insertionSort(int [] n){
        for(int i = 1; i < n.length; i ++){
            for(int j = i; j > 0 && n[j] > n[j -1]; j--){
                //swap
                int temp = n[j];
                n[j]= n[j - 1];
                n[j - 1] = temp;
            }
        }
        return n;
    }
    
}
