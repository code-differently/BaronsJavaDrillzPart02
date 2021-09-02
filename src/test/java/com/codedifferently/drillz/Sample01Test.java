package com.codedifferently.drillz;

import org.junit.Assert;
import org.junit.Test;

public class Sample01Test {

    @Test
    public void everyNthTest01(){
        //Given
        Sample01 sample01Ref = new Sample01();
        String input = "Miracle";
        String expected = "Mrce";
        //When
        String actual = sample01Ref.everyNth(input, 2);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void everyNthTest02(){
        //Given
        Sample01 sample01Ref = new Sample01();
        String input = "abcdefg";
        String expected = "aceg";
        //When
        String actual = sample01Ref.everyNth(input, 2);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void everyNthTest03(){
        //Given
        Sample01 sample01Ref = new Sample01();
        String input = "abcdefg";
        String expected = "adg";
        //When
        String actual = sample01Ref.everyNth(input, 3);

        //Then
        Assert.assertEquals(expected, actual);

    }
}
