/// move zero at end
package mathquestions;

import java.util.Arrays;

public class MoveZero {
    static void findZero(int array[],int n){
        int index =0;
        for(int i=0; i< n;i++ ){
          if(array[i] !=0){
            array[index++]= array[i];
          }  
        }
        while (index < n) {
            array[index++] = 0;
        }
        System.out.println("when first enter in loop " +  array);

    }
    public static void main(String[] args) {
        int array []={1,0,2,0,3};
        int n = array.length;
        findZero(array,n);
        System.out.println(Arrays.toString(array));
    }
}
