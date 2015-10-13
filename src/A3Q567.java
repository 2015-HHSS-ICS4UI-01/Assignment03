/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Walter
 */
public class A3Q567 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] n ={2, 5,3, 2, 3, 1};
//        bucketSort(n);
        
        String[] word = new String[6];
        word[0] = "messi";
        word[1] = "ronaldo";
        word[2] = "costa";
        word[3] = "hazard";
        word[4] = "iniesta";
        word[5] = "benzema";
        A3Q7(word);
        
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
            
        }
    }
    
    public static void insertionSort(int[] n){
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
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
            
        }
}
    
    public static void bucketSort(int[] n)
    {
        int [] tracker = new int[101];
        int j = 0;
        
        for (int i = 0; i < 101; i++) {
            tracker[i] =0;
        }
        
        for (int i = 0; i < n.length; i++) {
            int a = n[i];
            tracker[a]++;
            
            
        }
        
        for (int i = 0; i < tracker.length; i++) {
            
            while(tracker[i] >0){
                n[j] = i;
            tracker[i]--;
            j++;
            
        }
    }for (int i = 0; i < n.length; i++) {
           System.out.println(n[i]); 
        }
        
    }
    
    public static void A3Q7(String[] word){
        for(int i = 1; i < word.length; i++)
   {
      int j = i;
      while(j>0 && word[j-1].compareTo(word[j]) >0)
      {
         String temp = word[j];
         word[j] = word[j-1];
         word[j-1] = temp;
         j--;
      }
   }
}
    }
    

//n 


