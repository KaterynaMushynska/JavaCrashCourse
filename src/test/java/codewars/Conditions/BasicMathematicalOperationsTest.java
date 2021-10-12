package codewars.Conditions;

import com.Conditions.BasicMathematicalOperations;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BasicMathematicalOperationsTest {
    BasicMathematicalOperations basicOps = new BasicMathematicalOperations();

    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
    }
}
