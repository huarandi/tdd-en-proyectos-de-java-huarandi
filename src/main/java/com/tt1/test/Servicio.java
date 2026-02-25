package com.tt1.test;

import java.util.Date;
import java.util.List;

public class Servicio {
    private Mailer mailer;
    private Repo repo;

    public Servicio(Mailer mailer, Repo repo) {
        this.mailer = mailer;
        this.repo = repo;
    }

    protected boolean hasFailedToDo(){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    protected boolean notifyFailed(){
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
