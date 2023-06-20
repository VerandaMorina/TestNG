package class1;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 4,groups = "smoke")
    public void Atest(){
        System.out.println("i am a test A");
    }
    @Test(priority = 3)
    public void Btest(){
        System.out.println("i am a test B");
    }
    @Test(priority = 2)
    public void Ctest(){
        System.out.println("i am a test C");
    }
    @Test(priority = 1)
    public void Dtest(){
        System.out.println("i am a test D");
    }
    //mo priority meantion means 0 highest priority
    @Test
    public void Ftest(){
        System.out.println("i am a test F");
    }
}
