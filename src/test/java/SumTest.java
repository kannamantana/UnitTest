import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Executable;

public class SumTest {

@Test
    public void testSum () {
        int value1 = 40,  value2 = 50,  value3 = 2,  expected = 92;
        Sum example = new Sum ();
        int result = example.sum(value1, value2, value3);
        Assertions.assertEquals(expected, result);
    }

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testPrint() {
        Sum exampleSecond = new Sum();
        exampleSecond.print();
        Assert.assertEquals("Введите число : ", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    
    @Test
    public void testComparing() {
        int a = 200;
        boolean expected = true;
        Sum exampleThird = new Sum ();
       boolean result = exampleThird.comparing(a);
        Assertions.assertEquals(expected, result);
    }
}


