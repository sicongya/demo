package com.guigu.bean;

public class Single {
    private static Single st;

    private Single(){

    }
    public static  Single getInstance(){
        if (st == null) {
            st = new Single();
        }
        return st;
    }
    String q = "sdfsdfsdf";
}
