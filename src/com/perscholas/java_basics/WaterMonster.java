package com.perscholas.java_basics;

import javax.xml.namespace.QName;

public class  WaterMonster extends Monster{

    public WaterMonster(String b){
        name = b;
        System.out.println(name);
    }
    @Override
    public String attack(){
        return "Attack with water";
    }
}
