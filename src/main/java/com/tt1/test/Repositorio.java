package com.tt1.test;

public class Repositorio {
    public DB db;

    public Repositorio(DB db){
        this.db = db;
    }

    public ToDo getToDo(String name){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean setCompletado(ToDo t, boolean completado){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addToDo(ToDo t){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addEmail(String email){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
