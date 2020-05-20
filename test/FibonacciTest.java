import etc.Fibonacci;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FibonacciTest {
    @Test
    public void fibonacciList() {
        assertEquals(0, Fibonacci.fibonacci(0).size());
        assertEquals(Arrays.asList(0), Fibonacci.fibonacci(1));
    }
}
