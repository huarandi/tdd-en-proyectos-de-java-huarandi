package com.tt1.test;

import java.util.List;

public interface Repo {
    public ToDo getToDo(String name);

    List<ToDo> getAllToDo();

    void setCompletado(ToDo t, boolean completado);

    void addToDo(ToDo t);

    void addEmail(String email);

    List<String> getAllEmail();
}
