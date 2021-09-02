package com.codedifferently.drillz;

import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void iceHotTest01(){
        //Given
        Problem02 problem02Ref = new Problem02();
        int temp1 = 120;
        int temp2 = -1;
        boolean expected = true;

        //When
        boolean actual = problem02Ref.icyHot(temp1, temp2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iceHotTest02(){
        //Given
        Problem02 problem02Ref = new Problem02();
        int temp1 = -2;
        int temp2 = -2;
        boolean expected = false;

        //When
        boolean actual = problem02Ref.icyHot(temp1, temp2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iceHotTest03(){
        //Given
        Problem02 problem02Ref = new Problem02();
        int temp1 = 2;
        int temp2 = 120;
        boolean expected = false;

        //When
        boolean actual = problem02Ref.icyHot(temp1, temp2);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
