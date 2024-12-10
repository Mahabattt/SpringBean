package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Author {
    private String name;

    public Author(){
        this.name = "Симада Содзи";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Author{name='" + name + "'}";
    }
}
