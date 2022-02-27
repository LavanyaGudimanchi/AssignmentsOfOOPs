package com.perscholas.java_basics;

public class FireMonster extends Monster {
    public FireMonster(String a) {
        name = a;
        System.out.println(a);
    }

@Override
    public String attack() {
return "Attack with Fire";

    }

}
