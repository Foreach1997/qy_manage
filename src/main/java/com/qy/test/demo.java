package com.qy.test;

import java.time.LocalDate;
import java.time.Period;

public class demo {

    public static void main(String[] args) {

        LocalDate localDate =  LocalDate.of(2019,4,22);
        Period day = Period.between(localDate,LocalDate.now());
        System.out.println(day.getDays());
    }




}
