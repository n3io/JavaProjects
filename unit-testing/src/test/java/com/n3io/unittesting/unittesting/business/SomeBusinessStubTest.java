package com.n3io.unittesting.unittesting.business;

import com.n3io.unittesting.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeDataServiceStub implements SomeDataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3};
    }
}

public class SomeBusinessStubTest {

    @Test
    public void calculateSum_basicUsingLamda(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(()-> {return new int[]{1,2,3};});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;

       assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setup");

    }
}