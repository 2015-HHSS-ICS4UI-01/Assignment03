/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author kampn2687
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array length");
        int l = in.nextInt();
        int [] iSort  = new int [l];
        
        System.out.println("enter " + iSort.length +" numbers to be sorted between 0 and 100" );
        
        for(int i = 0; i < iSort.length; i++){
            iSort[i]= in.nextInt();
            
            while(iSort[i] > 100 || iSort[i] < 0){
                System.out.println("Enter a number between 0 and 100");
                iSort[i]= in.nextInt(); 
            }
        }
        bucketSort(iSort);
        for( int i = 0; i < l; i++ ){
            System.out.print(iSort[i] + " ");
            
        }
        System.out.println("");
    }
        static int [] bucketSort(int [] l){
        int [] track = new int [101];
        for(int i = 0; i < track.length ; i ++  ){
            int count = 0;
            for(int j = 0; j < l.length; j++){
                if(l[j] == i ){
                    count ++;
                }
            }
            track[i] = count;
        }
        int placeHolder = 0;
        for(int i = 0; i < track.length; i++){
            while(track[i] > 0){
                    l[placeHolder] = i;
                    track[i]--;
                    placeHolder++;       
            }
        }
        return l;    
    }
}

