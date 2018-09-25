package com.n3io.unittesting.unittesting.business;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {

    List mock = mock(List.class);

    @Test
    public void size_basic() {
        when(mock.size()).thenReturn(5);
        assertThat(mock.size()).isEqualTo(5);

    }

    @Test
    public void size_returnDifferentValues() {
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertThat(mock.size()).isEqualTo(5);
        assertThat(mock.size()).isEqualTo(10);
    }

    @Test
    public void returnWithParameters() {
        when(mock.get(0)).thenReturn("in28Minutes");
        assertThat(mock.get(0)).isEqualTo("in28Minutes");
    }

    @Test
    public void returnWithGenericParameters() {
        when(mock.get(anyInt())).thenReturn("in28Minutes");
        assertThat(mock.get(2)).isEqualTo("in28Minutes");
    }

    @Test
    public void verificationBasics() {
        //setup
        String value1 = (String)mock.get(0);
        //String value2 = (String)mock.get(0);
        verify(mock).get(0);
        verify(mock, times(1)).get(anyInt());
        verify(mock, atLeast(1)).get(anyInt());
        verify(mock, atMost(2)).get(anyInt());

        //verify
    }

    @Test
    public void argumentCapturing() {

        mock.add("SomString");

        //verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());
        assertThat(captor.getValue()).isEqualTo("SomString");
    }

    @Test
    public void multiArgumentCapturing() {

        mock.add("SomString");
        mock.add("SomString");

        //verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock, times(2)).add(captor.capture());
        assertThat(captor.getAllValues().get(0)).isEqualTo("SomString");
    }

    @Test
    public void mocking() {

        ArrayList arrayListMock = mock(ArrayList.class);

        System.out.println(arrayListMock.get(0));
        System.out.println(arrayListMock.size());
        System.out.println(arrayListMock.add("Test"));
        System.out.println(arrayListMock.add("Test2"));
        System.out.println(arrayListMock.size());
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());


    }

    @Test
    public void spying()  {

        ArrayList arrayListSpy = spy(ArrayList.class);

        arrayListSpy.add("Test0");
        System.out.println(arrayListSpy.get(0));
        System.out.println(arrayListSpy.size());
        System.out.println(arrayListSpy.add("Test"));
        System.out.println(arrayListSpy.add("Test2"));
        System.out.println(arrayListSpy.size());
        when(arrayListSpy.size()).thenReturn(5);


    }
}