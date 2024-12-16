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
        while (index <n) {
            array[index++] =0;
        }
    }
    public static void main(String[] args) {
        int array []={2,5,8,0,0,5,0,8,0};
        int n = array.length;
        findZero(array,n);
        System.out.println(Arrays.toString(array));
    }
}
