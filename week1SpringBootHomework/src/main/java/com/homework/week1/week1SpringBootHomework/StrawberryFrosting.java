package com.homework.week1.week1SpringBootHomework;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting{
    public String getFrostingType(){
        return "Strawberry Frosting";
    }
}
