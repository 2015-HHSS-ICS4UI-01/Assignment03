
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    
    public void bucketSort(int[] n){
        int[] bucket = new int[101];
        for(int i = 0; i <= 100; i++){          //set the buckets (every bucket
                                                //is set to be "empty"
            bucket[i] = 0;
        }
    
        for(int i = 0; i < n.length; i++){
                                                //go through the array, fill (+1)
                                                //corresponding bucket if match
            int j = n[i];
           
            bucket[j] += 1;
         
        }
        
        int counter = 0;                        //counter to go through buckets
        
        for(int i = 0; i <=100; i++){
            
            for(int g = bucket[i]; g>0; g--){   //if equal or more than 1 number in
                                                //bucket, take that number in the bucket
                                                //and put into sorted array, then subtract 
                                                //1 from that bucket
                n[counter] = i;
                counter++;
            }
        }
    }
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        for(int i = 0; i<n.length; i++){
            n[i] = input.nextInt();
        }
        A3Q6 test = new A3Q6();
        test.bucketSort(n);
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
        
    }
}
