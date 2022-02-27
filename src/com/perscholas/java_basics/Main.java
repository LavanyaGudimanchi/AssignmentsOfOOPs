package com.perscholas.java_basics;

import javax.management.monitor.MonitorSettingException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Monster m1 = new FireMonster("r2n2");
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2r2");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());



        m1=new StoneMonster("a2b2");
                   System.out.println(m1.attack());
        Monster m4=new Monster();
        System.out.println(m4.attack());


    }
}
