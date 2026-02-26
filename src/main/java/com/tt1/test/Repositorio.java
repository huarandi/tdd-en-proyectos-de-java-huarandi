package com.tt1.test;

import java.util.List;

public class Repositorio implements Repo {
    public DB db;

    public Repositorio(DB db){
        this.db = db;
    }

    @Override
    public ToDo getToDo(String name){
        return db.getToDo(name);
    }

    @Override
    public List<ToDo> getAllToDo(){
        return db.getAllToDo();
    }

    @Override
    public void setCompletado(ToDo t, boolean completado){
        ToDo t2 = new ToDo(t.getName(), t.getDescription(), t.getLimit(), completado);
        db.updateToDo(t.getName(), t2);
    }

    @Override
    public void addToDo(ToDo t){
        db.addToDo(t);
    }

    @Override
    public void addEmail(String email){
        db.addEmail(email);
    }

    @Override
    public List<String> getAllEmail(){
        return db.getAllEmail();
    }
}
