package com.homework.week1.week1SpringBootHomework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    final private Frosting frosting;
    final private Syrup syrup;

    @Autowired
    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }


    String bakeCake(){

        return "Bake a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType() + ".";

    }




}
