package codewars.Classes;

import com.Classes.LombokEncapsulation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LombokEncapsulationTest {
    @Test
    public void testSample() {
        LombokEncapsulation lm = new LombokEncapsulation();
        assertEquals(
                0,
                lm.getNumber()
        );
    }
}
