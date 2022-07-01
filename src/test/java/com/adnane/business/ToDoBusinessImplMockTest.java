package com.adnane.business;

import com.adnane.data.api.ToDoService;
import com.adnane.data.api.ToDoServiceStub;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoBusinessImplMockTest {

    // Mocking is creating objects that simulate the behavior of real objects.
    // Unlike stubs, mocks are dynamically created from code - at runtime.
    // Mocks offer more functionality than stubs.
    // You can verify method calls and a lot of other things

    @Test
    public void isToDosListContainsToDosRelatedToSpring_usingAMock(){
        // Given
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> toDos = Arrays.asList(
                "Learn Spring MVC",
                "Learn Spring",
                "Learn more about jenkins",
                "Learn kafka streams"
        );
        // Stubbing a method
        when(toDoServiceMock.retrieveToDos("Adnane")).thenReturn(toDos);
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);

        // When
        List<String> filteredToDos = toDoBusiness.retriveToDosRelatedToSpring("Adnane");

        // Then
        var expected = 2;
        assertEquals(expected, filteredToDos.size());
    }
}