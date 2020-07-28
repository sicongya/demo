package com.guigu.bean;

import java.util.HashMap;

/**
 * @auther sicong
 * @date 2020/7/28 - 21:05
 */
public class DebugerTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","sicong");
        map.put("age","23");
        map.put("school","blueFly");
        map.put("major","computer");

        String name = map.get("name");
        System.out.println("name = " + name);
        System.out.println(name);
        map.remove("major");
        System.out.println(map);
    }
}
