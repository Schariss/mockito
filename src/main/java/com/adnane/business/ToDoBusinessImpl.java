package com.adnane.business;

import com.adnane.data.api.ToDoService;

import java.util.List;

public class ToDoBusinessImpl {
    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService){
        this.toDoService = toDoService;
    }

    // write tests on this method
    public List<String> retriveToDosRelatedToSpring(String user){

    }
}
