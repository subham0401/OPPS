package org.example;

import java.net.IDN;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Parent {
    private String name;

    private String id;

    private final Integer ID = 1001;

    public Parent() {
        this.name = "";
        this.id = "";
    }

    public Parent(String name, String id) {
        this.name = name;
        this.id = id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getID() {
        return ID;
    }


    public void show(){
        int sum = 0;
        for(int i=0;i<10;i++){
            sum+=i*10;
        }
        System.out.println("result = "+sum);
    }

    public void show1(){
        System.out.println("I am in a show of bade log");
    }
}
