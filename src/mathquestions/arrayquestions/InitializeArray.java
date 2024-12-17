//How do you initialize an array of size 5 with all elements set to 0? Write the code.
 
package mathquestions.arrayquestions;

import java.util.Arrays;

public class InitializeArray {

    public static void main(String[] args) {
        // Initializing an array of size 5, all elements default to 0
        int[] array = new int[5]; 
        System.out.println(Arrays.toString(array)); // Output: [0, 0, 0, 0, 0]
    }
}
