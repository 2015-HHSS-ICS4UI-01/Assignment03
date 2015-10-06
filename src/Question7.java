/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Question7 {

    public void insertionSort(String[] words){
        
        //loop until all words have been seen and sorted
        for(int i = 1; i < words.length; i++){
            
            int j = i;
            
            
            //while the first word is alphabetically after the second word
            //and while number at j is greater than 0
            //swap the first word and the second word's positions
            //and count down from number at j
            while(j > 0 && words[j-1].compareTo(words[j]) > 0){
                
                String temp = words[j]; 
                
                words[j] = words[j-1];
                words[j-1] = temp;

                j--;
            }
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a string with words to be sorted
        String[] words = {"pizza", "cupcake", "pie", "apples"};
        
        Question7 test = new Question7();
        
        test.insertionSort(words);
        
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
