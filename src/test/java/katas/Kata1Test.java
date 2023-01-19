package katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata1Test {

    @Test

    public void test1(){
        Assertions.assertEquals(4,Kata1.suma(1,3));
        Assertions.assertEquals(25,Kata1.suma(Kata1.suma(10,5),Kata1.suma(5,5)));
        Assertions.assertEquals(10,Kata1.suma(Kata1.suma(2,3),5));
        Assertions.assertEquals(7,Kata1.suma(1,Kata1.suma(3,3)));
    }
}
