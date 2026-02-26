package com.tt1.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestServicio {
    private final List<ToDo>  td = new ArrayList<>();
    private final List<String> em = new ArrayList<>();

    private Repo repo;
    private Mailer mailer;

    private Servicio ser;

    @BeforeEach
    public void init(){
        for(int i = 0; i < 10; i++){
            td.add(new ToDo("td"+i, "desc"+i, new Date(System.currentTimeMillis() + 1000000), false));
            em.add("em"+i);
        }
        repo = new RepoStub(td, em);
        mailer = new MailerStub();
        ser = new Servicio(mailer, repo);
    }

    @Test
    public void hasFailedToDo(){
        Assertions.assertFalse(ser.hasFailedToDo());
        td.add(new ToDo("td"+11, "desc"+11, new Date(System.currentTimeMillis() - 100000), false));
        ser = new  Servicio(new MailerStub(), new RepoStub(td, em));
        Assertions.assertTrue(ser.hasFailedToDo());
    }

    @Test
    public void addToDo(){
        ser.addToDo("1", "desc", new Date());
        Assertions.assertNotNull(repo.getToDo("1"));
    }

    @Test
    public void getUncompletedToDo(){
        List<ToDo> un = ser.getUncompletedToDos();
        for(ToDo t : td){
            if(!un.contains(t)) Assertions.fail();
        }
        Assertions.assertTrue(true);
    }

    @Test
    public void completeToDo(){
        ToDo t = ser.getUncompletedToDos().getFirst();
        ser.completeToDo(t);
        Assertions.assertTrue(repo.getToDo(t.getName()).isCompleted());
    }

    @Test
    public void addEmail(){
        String em1 =  "em134";
        ser.addEmail(em1);
        Assertions.assertTrue(repo.getAllEmail().contains(em1));
    }
}
