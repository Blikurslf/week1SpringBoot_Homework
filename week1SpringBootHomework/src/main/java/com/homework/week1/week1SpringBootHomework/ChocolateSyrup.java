package com.homework.week1.week1SpringBootHomework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("chocolateSyrup")

public class ChocolateSyrup implements Syrup{
    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
