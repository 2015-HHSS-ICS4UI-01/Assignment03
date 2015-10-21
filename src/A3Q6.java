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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = {1,65,98,1,72,23,11};//array of values
        A3Q6 test = new A3Q6();//new test 
        test.bucketSort(n);//sort
        for(int i = 0; i < n.length; i++){//will output the numbers so we can check if they are sorterd
            System.out.println(n[i]);
        }
        
    }
        public void bucketSort(int[] n){
        int[] track = new int[101]; //creates new tracker array
        for(int i = 0; i <= 100; i++){ //gives each track value 0
            track[i] = 0;
        }
    
        for(int i = 0; i < n.length; i++){
            
            int j = n[i]; //creates an int and puts a value into what ever position n is currently on
           
            track[j] += 1;//add 1 to the tracker position
         
        }
        
        int counter = 0;//variable for a position in the orginal array
        
        for(int i = 0; i <=100; i++){//run through each position in thew tracker array
            
            for(int g = track[i]; g>0; g--){//also run through spots in the tracker array that have values
                n[counter] = i;//fill original array with value of tracker
                counter++;//add 1 to counter so it will keep them in order
            }
        }
    }
}
