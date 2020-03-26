package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result  a x2+b x+c = 0
        String result = "";
        double discriminant = b*b - 4*a*c;
        double x1;
        double x2;

        if (a == 0){
            result = "The 'a' coefficient should not be zero!";
        }else if (discriminant < 0){
        result = "No roots on the set of real numbers!";
        } else if (discriminant == 0){
            x1 = -b / (2 * a);
            x2 = x1;
            result = "Two real, identical roots: [x1 && x2] = " + x1;
        } else {
            x1 = (-1 * b  + (Math.sqrt(discriminant))) / (2 * a);
            x2 = (-1 * b - (Math.sqrt(discriminant))) / (2 * a);
            result = "Discriminant: " + discriminant + ", x1: " + x1 + ", x2: " + x2;
        }

        return result;
    }

}
