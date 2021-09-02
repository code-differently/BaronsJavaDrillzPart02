package com.codedifferently.drillz;

import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void lastDigitTest01(){
        // Given
        Problem01 problem01Ref = new Problem01();
        int inputA = 7;
        int inputB = 17;
        boolean expected = true;

        // When
        boolean actual = problem01Ref.lastDigit(inputA, inputB);

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastDigitTest02(){
        // Given
        Problem01 problem01Ref = new Problem01();
        int inputA = 6;
        int inputB = 17;
        boolean expected = false;

        // When
        boolean actual = problem01Ref.lastDigit(inputA, inputB);

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastDigitTest03(){
        // Given
        Problem01 problem01Ref = new Problem01();
        int inputA = 3;
        int inputB = 113;
        boolean expected = true;

        // When
        boolean actual = problem01Ref.lastDigit(inputA, inputB);

        //Then

        Assert.assertEquals(expected, actual);
    }
}
