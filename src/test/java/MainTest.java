 import org.junit.jupiter.api.*;


public class MainTest {
    @Test
    public void test_irgendwas(){
        //arrange

        //act
        String actual = Main.GetMessage();

        //assert
        Assertions.assertEquals("hello MaintenanceMonitor", actual);
    }
}
