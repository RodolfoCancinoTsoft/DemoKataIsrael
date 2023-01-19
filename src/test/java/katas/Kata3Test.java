package katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata3Test {

    @Test

    public void test001(){
        Assertions.assertEquals(5,Kata3.maximoComunDivisor(15,20));
        Assertions.assertEquals(5,Kata3.maximoComunDivisor(25,35));
        Assertions.assertEquals(50,Kata3.maximoComunDivisor(100,50));
        Assertions.assertEquals(1,Kata3.maximoComunDivisor(151,133));
        Assertions.assertEquals(4,Kata3.maximoComunDivisor(12,8));
    }
}
