/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] e = {30, 50, 60, 25, 8, 44, 1, 227};
        for (int i = 1; i < e.length; i++) {
            int j = i;
            while (j > 0 && e[j - 1] < e[j]) {
                int temp = e[j];
                e[j] = e[j - 1];
                e[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < e.length; i++){
        System.out.print(e[i] + ", ");
        }
    }
}
