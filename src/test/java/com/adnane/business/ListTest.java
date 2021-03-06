package com.adnane.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void mockListSizeMethod(){
        List listMock = mock(List.class);
        // Whenever we call the size method we always get the same value
        when(listMock.size()).thenReturn(2);
        int expected = 2;
        assertEquals(expected, listMock.size());
    }

    @Test
    public void mockListSizeMethod_ReturnMultipleValues(){
        List listMock = mock(List.class);
        // Whenever we call the size method we always get the same value
        when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
        assertEquals(4, listMock.size());
    }

    @Test
    public void mockListGetMethod(){
        List listMock = mock(List.class);
        // Argument Matcher
        when(listMock.get(anyInt())).thenReturn("First item");
        assertEquals("First item", listMock.get(0));
        assertEquals("First item", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void mockListThrowException(){
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));

        listMock.get(0);
    }
}
