package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
    @Test
    public void AFirstTestCase(){
        System.out.println("hello i am the first test case");
    }
    @Test
    public void BSecondTestCase(){
        System.out.println("i am second test case");
    }
    @Test
    public void CThirdsTestCase(){
        System.out.println("I am the thirds test case");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after method");
    }

}
