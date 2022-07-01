package com.adnane.data.api;

import java.util.List;

// Create ToDoServiceStub
// Test ToDoBusinessImpl using ToDoServiceStub
public interface ToDoService {
    public List<String> retrieveToDos(String user);
}
