//arr[2]=5
/*here i am initialize that i have present array list at index 3 have 5 element  */
package mathquestions.arrayquestions;

import java.util.Arrays;

public class initialize1 {
    public static void main(String[] args) {
        // Step 1: Create an array of size 5
        int[] array = new int[5]; // Default values will be 0
        
        // Step 2: Assign the value 5 to the 3rd element (index 2)
        array[2] = 5;

        // Step 3: Print the array elements to verify the assignment
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("" + Arrays.toString(array));
    }
}

