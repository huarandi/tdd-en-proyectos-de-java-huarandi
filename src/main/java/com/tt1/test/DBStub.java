package com.tt1.test;

import java.util.List;

public class DBStub implements DB {
    public boolean addToDo(ToDo t){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeToDo(String name){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ToDo getToDo(String name){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean updateToDo(String name, ToDo t){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean existToDo(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<ToDo> getAllToDo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addEmail(String email) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeEmail(String email) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public List<String> getAllEmail() {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public boolean existEmail(String email) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }
}
