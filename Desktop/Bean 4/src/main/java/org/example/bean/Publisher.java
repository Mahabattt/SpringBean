package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private String name;

    public Publisher(){
        this.name = "Default Publisher";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Publisher{name='" + name + "'}";
    }

}

