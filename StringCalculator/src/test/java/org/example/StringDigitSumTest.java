package org.example;

import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class StringDigitSumTest {
    @Test
    public void StringDigitSumTest(){
        StringDigitSum string1 = new StringDigitSum("");
        StringDigitSum string2 = new StringDigitSum("1");
        StringDigitSum string3 = new StringDigitSum("1,2");

        Assertions.assertEquals(string1.Add(string1.getNumbers()), 0);
        Assertions.assertEquals(string2.Add(string2.getNumbers()), 1);
        Assertions.assertEquals(string3.Add(string3.getNumbers()), 3);
    }
}
