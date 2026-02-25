package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class RepoStub implements Repo {
    private List<ToDo> td;
    private List<String> em;


    public RepoStub(List<ToDo> td, List<String> em){
        this.td = td;
        this.em = em;
    }

    @Override
    public ToDo getToDo(String name) {
        return null;
    }

    @Override
    public List<ToDo> getAllToDo() {
        return List.of();
    }

    @Override
    public void setCompletado(ToDo t, boolean completado) {

    }

    @Override
    public void addToDo(ToDo t) {

    }

    @Override
    public void addEmail(String email) {

    }

    @Override
    public List<String> getAllEmail() {
        return List.of();
    }
}
