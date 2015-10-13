/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vonhn0812
 */
public class A3Q57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        String[] nums = new String[6];
        nums[0] = "alpha";    
        nums[1] = "theta";
        nums[2] = "gamma";
        nums[3] = "omega";
        nums[4] = "zeus";
        nums[5] = "beta";
        
        Question7(nums);
        
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);  
}
        
       
    }


public static void Question5(int[] n){
   for(int i = 0; i < n.length; i++)
   {
      int j = i;
      while(j>0 && n[j-1] < n[j])    //changed the comparison between n[j-1] and n[j]
      {
         int temp = n[j];
         n[j] = n[j-1];
         n[j-1] = temp;
         j--;
      }
   }
}
public static void Question6 (int[] n){
int[] track = new int[101];             //track array
int j =0;

for(int i = 0; i<n.length; i++){        //put values into tracker array
 track[n[i]]+=1;
}

for(int i=0; i<track.length; i++)       //replace old array with new sorted array
{
   while(track[i]>0){
    n[j] = i;
    track[i]--;
    j++;
   }
   
}


}

public static void Question7(String[] n){    //string
   for(int i = 1; i < n.length; i++)
   {
      int j = i;
      while(j>0 && n[j-1].compareTo(n[j])>0) //changed the integer comparision to a string comparision
      {
         String temp = n[j];
         n[j] = n[j-1];
         n[j-1] = temp;
         j--;
      }
   }
}








}







