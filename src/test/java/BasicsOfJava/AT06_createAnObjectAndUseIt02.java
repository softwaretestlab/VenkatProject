package BasicsOfJava;

import Basics.AT01_MainClassUsage01;
import org.junit.Test;

public class AT06_createAnObjectAndUseIt02 {
    @Test
    public void test10() {
        AT01_MainClassUsage01 obj = new AT01_MainClassUsage01();
        obj.test001();

        AT02_LearnAboutMethod_JUnit obj1 = new AT02_LearnAboutMethod_JUnit();
        obj1.test01();
        obj1.test02();

    }

}

