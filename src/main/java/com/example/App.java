package com.example;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        String json = gson.toJson(new Person("Alice", 30));
        System.out.println("JSON généré : " + json);
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }
}