package org.example;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        HashTable Hmap = new HashTable();
        Hmap.put("name", "Riley");
        Hmap.put("age", "28");
        Hmap.put("gender", "male");
        Hmap.put("computer", "screen");
        Hmap.put("keyboard", "mouse");
//        Hmap.put("book", "shelf");
//        Hmap.put("street", "light");
//        Hmap.put("table", "cloth");
//        Hmap.put("water", "bottle");
//        Hmap.put("bed", "spread");




//        Hmap.remove("name");
//        Hmap.remove("age");



        System.out.println(Hmap.getAll());

//
//        System.out.println(Hmap.get("name"));
//        System.out.println(Hmap.get("age"));
//        System.out.println(Hmap.get("gender"));
//        System.out.println(Hmap.get("computer"));
//        System.out.println(Hmap.get("keyboard"));






    }
}
