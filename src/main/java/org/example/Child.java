package org.example;

import java.security.PublicKey;

public class Child extends Parent{
    public Child() {
        super();
    }
    public Child(String name , String Id) {
        super(name,Id);
    }

    public void show(){
        super.show();
    }

    @Override
    public void show1(){
        System.out.println("we are in show of buccha party");
    }

}
