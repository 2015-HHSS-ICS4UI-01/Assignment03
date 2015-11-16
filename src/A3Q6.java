/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class A3Q6 {
public void bucketsort(int[]n){
    int[] bucket = new int[101];
    for(int i = 0; i<bucket.length;i++){
        bucket[i] = 0;                  //every spot in the bucket is set to zero.
    }
    for(int i =0; i<n.length;i++)
    {
        bucket[n[i]]++;                 //the numbers are addded to the buckets.
    }
    int counter = 0;
    for(int i = 0;i<bucket.length;i++){  //to take the numbers out of the bucket to be sorted.
        for(int o = 0; o<bucket[i];o++){ //This is to put the numbers back in the array in the sorted order.
            n[counter] = i;              //array n at the spot of the counter is made int i.
            counter++;                   //adding one to the counter.
        }
    }
}
   
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        int rand = 100;
        int[] n = new int[rand];
        for(int i = 0;i< rand; i++){
        n[i]=(int)(Math.random()*101);
    }
        
        
        test.bucketsort(n);
         for(int i = 0; i <n.length; i++)
         {
             System.out.println(n[i]);
         }
    }
}
