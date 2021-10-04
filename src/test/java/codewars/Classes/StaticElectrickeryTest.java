package codewars.Classes;

import com.Classes.StaticElectrickery;
import org.junit.Test;

public class StaticElectrickeryTest {
    @Test
    public void test() {
        System.out.println(StaticElectrickery.INST.plus100(23));
    }
}
