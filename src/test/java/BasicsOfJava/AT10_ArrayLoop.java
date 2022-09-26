package BasicsOfJava;

import org.junit.Test;

public class AT10_ArrayLoop {
    @Test
    public void test14() {
        // variable  age is an array
        int[] age = {10, 20, 30, 40, 50, 60};
        //length of array
        int lengthOfArray=age.length;
        System.out.println("length of arrray is : "+lengthOfArray); //6
        //forloop
        for(int i=0;i<lengthOfArray;i++){
            System.out.println("Array index is "+i+" its value is "+age[i]);

        }
    }
}
