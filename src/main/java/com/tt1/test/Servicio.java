package com.tt1.test;

import java.util.Date;
import java.util.List;

public class Servicio {
    private final  Mailer mailer;
    private final  Repo repo;

    public Servicio(Mailer mailer, Repo repo) {
        this.mailer = mailer;
        this.repo = repo;
    }

    protected boolean hasFailedToDo(){
        return repo.getAllToDo().stream().anyMatch((ToDo t) -> t.getLimit().getTime() < System.currentTimeMillis());
    }

    protected void notifyFailed(){
        List<String> em = repo.getAllEmail();
        for(String e: em){
            mailer.sendMail(e, "Hay tareas vencidas");
        }
    }

    public void addToDo(String name, String desc, Date limit){
        repo.addToDo(new ToDo(name, desc, limit, false));
        if(hasFailedToDo()) notifyFailed();
    }

    public boolean completeToDo(ToDo t){
        if(hasFailedToDo()) notifyFailed();
        if(getUncompletedToDos().contains(t)) {
            repo.setCompletado(t, true);
            return true;
        }
        return false;
    }

    public List<ToDo> getUncompletedToDos(){
        if(hasFailedToDo()) notifyFailed();
        List<ToDo> ret = repo.getAllToDo().stream().filter((ToDo t) -> !t.isCompleted()).toList();
        return ret;
    }

    public void addEmail(String email){
        repo.addEmail(email);
        if(hasFailedToDo()) notifyFailed();
    }
}
