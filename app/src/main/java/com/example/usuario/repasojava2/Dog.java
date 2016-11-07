package com.example.usuario.repasojava2;

/**
 * Created by Usuario on 22/10/2016.
 */

public class Dog {
    private int legs=4;
    private boolean hasOwner=false;
    private String name, lastName;
    //private Cat cat=new Cat();



    public Dog(int i, boolean b) {
    }

    public Dog(boolean b) {
        this.hasOwner = hasOwner;

    }

    public Dog() {

    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAccident(int lostLegs){
        legs=legs-lostLegs;
    }

}
