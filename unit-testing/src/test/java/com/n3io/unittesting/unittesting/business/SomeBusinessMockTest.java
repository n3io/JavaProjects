package com.n3io.unittesting.unittesting.business;

import com.n3io.unittesting.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl business = new SomeBusinessImpl();

    @Mock
    SomeDataService dataServieMock;

    @Test
    public void calculateSum_basic(){
        when(dataServieMock.retrieveAllData()).thenReturn(new int[]{1,2,3});
        assertThat(6).isEqualTo(business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSum_oneValue(){
        when(dataServieMock.retrieveAllData()).thenReturn(new int[]{5});
        assertThat(5).isEqualTo(business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSum_noValue(){
        when(dataServieMock.retrieveAllData()).thenReturn(new int[]{});
        assertThat(0).isEqualTo(business.calculateSumUsingDataService());
    }


}