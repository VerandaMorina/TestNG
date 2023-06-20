package class1;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false)
    public void Atest(){
        System.out.println("i am a test A");
    }
    @Test
    public void Btest(){
        System.out.println("i am a test B");
    }
    @Test(enabled = false)
    public void Ctest(){
        System.out.println("i am a test C");
    }
}
