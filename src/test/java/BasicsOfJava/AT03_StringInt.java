package BasicsOfJava;

import org.junit.Test;

public class AT03_StringInt {
    @Test
    public void test03() {
        //local variables
        int i=10;
        int j=20;
        int k = i+j;
        //print on the console
        System.out.println("Value of K is : "+k);

    }
    @Test
    public void test04() {
        //declare local variables
        String name="Software TestLab";
        String companyType=" Pty Ltd";
        String FullName= name+companyType;
        System.out.println("FullName of company is : "+FullName);

    }
}
