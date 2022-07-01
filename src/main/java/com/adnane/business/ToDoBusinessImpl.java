package com.adnane.business;

import com.adnane.data.api.ToDoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// ToDoBusinessImpl is called SUT (System Under Test)
// ToDoService is a dependency 
public class ToDoBusinessImpl {
    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService){
        this.toDoService = toDoService;
    }

    // write tests on this method
    public List<String> retriveToDosRelatedToSpring(String user){
        List<String> filteredToDos;
        List<String> toDos = toDoService.retrieveToDos(user);
        filteredToDos = toDos.parallelStream().filter(toDo -> toDo.contains("Spring")).collect(Collectors.toList());
        return filteredToDos;
    }
}
