package com.tt1.test;

import java.util.List;

public interface DB {
    boolean addToDo(ToDo t);

    boolean removeToDo(String name);

    ToDo getToDo(String name);

    boolean updateToDo(String name, ToDo t);

    boolean existToDo(String name);

    List<ToDo> getAllToDo();

    boolean addEmail(String email);

    boolean removeEmail(String email);

    List<String> getAllEmail();

    boolean existEmail(String email);
}
