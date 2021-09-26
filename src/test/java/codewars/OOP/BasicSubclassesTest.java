package codewars.OOP;

import com.OOP.BasicSubclasses.BasicSubclasses;
import com.OOP.BasicSubclasses.Human;
import com.OOP.BasicSubclasses.Man;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicSubclassesTest {
    @Test
    public void makingAdam(){
        Human[] paradise = BasicSubclasses.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}
