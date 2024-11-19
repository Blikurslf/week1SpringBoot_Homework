package com.homework.week1.week1SpringBootHomework;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting {
     public String getFrostingType() {
         return "Chocolate Frosting";
     }
}
