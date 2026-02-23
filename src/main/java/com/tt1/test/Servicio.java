package com.tt1.test;

import java.util.Date;
import java.util.List;

public class Servicio {
    private Mailer mailer;
    private Repositorio repo;

    public Servicio(Mailer mailer, Repositorio repo) {
        this.mailer = mailer;
        this.repo = repo;
    }

    private boolean hasFailedToDo(){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    private boolean notifyFailed(){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addToDo(String name, String desc, Date limit){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public boolean completeToDo(ToDo t){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public List<ToDo> getUncompletedToDos(){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addEmail(String email){
        throw  new UnsupportedOperationException("Not supported yet.");
    }
}
