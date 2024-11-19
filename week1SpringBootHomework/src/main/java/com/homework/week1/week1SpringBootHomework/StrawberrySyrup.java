package com.homework.week1.week1SpringBootHomework;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
