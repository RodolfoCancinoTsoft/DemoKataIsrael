package katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata2Test {

    @Test

    public void test1(){

        Assertions.assertEquals(false,Kata2.numeroPrimo(0));
        Assertions.assertEquals(false,Kata2.numeroPrimo(1));
        Assertions.assertEquals(true,Kata2.numeroPrimo(5));
        Assertions.assertEquals(true,Kata2.numeroPrimo(2));
        Assertions.assertEquals(false,Kata2.numeroPrimo(8));
        Assertions.assertEquals(false,Kata2.numeroPrimo(9));
        Assertions.assertEquals(false,Kata2.numeroPrimo(12));
        Assertions.assertEquals(false,Kata2.numeroPrimo(1963));

    }

}
