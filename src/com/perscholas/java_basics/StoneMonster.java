package com.perscholas.java_basics;

public class StoneMonster extends Monster{
public StoneMonster(String c) //Constructor
{
    name =c;
    System.out.println(name);
}
@Override
public String attack(){
    return "Attack with StoneMonster ";
}
}

