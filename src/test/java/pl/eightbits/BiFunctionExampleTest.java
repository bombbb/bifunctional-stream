package pl.eightbits;

import org.junit.Test;

public class BiFunctionExampleTest {

    @Test
    public void test() {
        new BiFunctionExample<>("1", "2") //
            .map(new ConcatenateToLongFunction())
            .print();
    }
}
