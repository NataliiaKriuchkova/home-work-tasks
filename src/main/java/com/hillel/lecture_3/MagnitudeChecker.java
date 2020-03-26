package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        double x;
        double y;
        if (a < 0)
        {
            x = -a;
        } else{
            x = a;
        }
        if (b < 0){
            y = -b;
        }else{
            y = b;
        }
        if (x > y){
            result = "The number " + a + " has the greatest magnitude!";
        }
        if (y > x) {
            result = "The number " + b + " has the greatest magnitude!";
        }
        if (y == x){
            result = "The number "+a+" and "+b+" are equals by magnitude!";
        }

        return result;
    }
}
