
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    
    public void alphaSort(String[] s){
        boolean swapped = false;
        do{                                             //keep swapping until all done
            swapped = false;
            for(int i = 0; i < s.length -1; i++){
                if(s[i].compareTo(s[i+1])>0){           //bubblesort, comparing if 
                                                        //s[i] is higher than the s[i+1]
                                                        //then swap
                    String temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                    swapped = true;                     //swapped, keep going
                }
            }
            
            
            
        }while(swapped);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A3Q7 test = new A3Q7();
        
        String[] s = new String[5];
        for(int i = 0; i <s.length; i++){
            s[i] = input.nextLine();
        }
        test.alphaSort(s);
        for(int i = 0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
