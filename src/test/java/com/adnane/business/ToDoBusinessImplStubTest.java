package com.adnane.business;

import com.adnane.data.api.ToDoServiceStub;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ToDoBusinessImplStubTest {

    @Test
    public void isToDosListContainsToDosRelatedToSpring_usingAStub(){
        // Given
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(new ToDoServiceStub());

        // When
        List<String> filteredToDos = toDoBusiness.retriveToDosRelatedToSpring("Adnane");

        // Then
        var expected = 2;
        assertEquals(expected, filteredToDos.size());
    }
}