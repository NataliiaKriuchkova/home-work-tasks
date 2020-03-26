package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double squareSide = Math.sqrt(squareArea);
        double insideRadius = squareSide/2;
        double insideArea = Math.PI*insideRadius*insideRadius;
        if (insideArea < circleArea){
            result = "The circle is not in the square";
        }else{
            result = "The circle is in the square";
        }


        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double squareSide = Math.sqrt(squareArea);
        double outsideArea = Math.PI*0.5*squareSide*squareSide;
        if (outsideArea < circleArea) {
            result = "The square is in the circle";
        }else{
            result = "The square is not in the circle";
        }


        return result;
    }

}
