
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janaj4926
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pro-tip: once you're done type 'DONE'");
        int c = 1;
        String[] words = new String[c];

        while(true){
            System.out.println("plz enter a word:");
            words[c] = in.nextLine();
            c++;
            
            if (words.equals("DONE")){
                break;
            }
        }
//        for (int i = 0; !words[i].equals("DONE"); i++) {
//            System.out.println("plz enter a word:");
//            words[i] = in.nextLine();
//            c++;
//        }
        
        String temp = "";
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].compareTo(words[i]) > 0) {
                temp = words[i];
                words[i] = words[i - 1];
                words[i - 1] = temp;
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ", ");
        }
    }
}
