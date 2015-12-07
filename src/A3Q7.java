
/**
 *
 * @author nitin
 */
public class A3Q7 {

    
    public void stringSort(String[] n) {
        //runs the loop until goes thru whole array
        for (int i = 0; i < n.length; i++) { 
            for (int j = i; j > 0 && n[j].compareTo(n[j - 1]) < 0; j--) { 
                //swaps if the word a spot j is less than spot j - 1
                String temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
            }
        }
    }

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        String[] n = {"zebra" , "apple", "banana", "cat", "dog", "Act"};
        test.stringSort(n);

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

    }

}
