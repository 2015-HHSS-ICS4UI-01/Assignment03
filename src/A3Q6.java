/**
 *
 * @author nitin
 */
public class A3Q6 {
    
    public void bucketSort(int[] n){
        int[] tracker = new int[101]; 
        // runs the loop until it has gone thru whole array and makes all spots = 0
        for (int i = 0; i < tracker.length; i++) {
            tracker[i] = 0;
        }

        //go through and count how many times one number is encountered
        for (int i = 0; i < n.length; i++) {           
            tracker[n[i]]++;
        }
        
        int num = 0;
        //runs the loop until it has gone thru whole array 
        for (int i = 0; i < tracker.length; i++) {
            //places the numbers in the array
            for (int j = 0; j < tracker[i]; j++) {
                n[num] = i;
                num++;
            }
        }
        
     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = {10, 6, 1, 23, 7, 10, 32, 99};
        
        A3Q6 test = new A3Q6();
        test.bucketSort(n);
        
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }  
    }
}

/*
    the reason why this is not very useful is because the ammount of processes it has go thru is not neccessary 
*/
