import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testGetHello {

    @Test
    public void testHello(){
        assertEquals("Hello world",new Hello().getHello());
    }
}
