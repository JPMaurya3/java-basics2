//multiply array with two and explain the process of multiplication
package mathquestions.arrayquestions;

public class MultiArray {
    public static void main(String[] args) {
        int intArray [] ={4,5,7,2,8};
        // for loop is used for iterate every element
        for( int i =0 ; i< intArray.length; i++){
            // print element in array 
            // System.out.println(intArray[i]); 
            // multiplication in array
            intArray[i]=intArray[i]*2;
            System.out.println(intArray[i]); 

        }
    }
}
