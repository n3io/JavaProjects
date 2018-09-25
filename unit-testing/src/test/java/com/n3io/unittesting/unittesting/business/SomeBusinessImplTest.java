package com.n3io.unittesting.unittesting.business;

import org.assertj.core.api.AbstractIntegerAssert;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {

    @Test
    public void calculateSum_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new int[]{1, 2, 3});
        int expectedResult = 6;

       assertThat(actualResult).isEqualTo(expectedResult);


    }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new int[]{});
        int expectedResult = 0;

        assertThat(actualResult).isEqualTo(expectedResult);


    }


}