package com.tt1.test;

import java.util.List;
import java.util.Optional;

public class RepoStub implements Repo {
    private final List<ToDo> td;
    private final  List<String> em;


    public RepoStub(List<ToDo> td, List<String> em){
        this.td = td;
        this.em = em;
    }

    @Override
    public ToDo getToDo(String name) {
        Optional<ToDo> op = td.stream().filter((ToDo td1) -> td1.getName().equals(name)).findFirst();
        if(op.isPresent()) return op.get();
        return null;
    }

    @Override
    public List<ToDo> getAllToDo() {
        return td;
    }

    @Override
    public void setCompletado(ToDo t, boolean completado) {
        td.stream().filter((ToDo td1) -> td1.getName().equals(t.getName())).findFirst().get().setCompleted(completado);
    }

    @Override
    public void addToDo(ToDo t) {
        td.add(t);
    }

    @Override
    public void addEmail(String email) {
        em.add(email);
    }

    @Override
    public List<String> getAllEmail() {
        return em;
    }
}
