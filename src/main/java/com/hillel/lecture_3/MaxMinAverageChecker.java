package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        int max = 0;

        if(a > b){
            max = a;
        }else if (max > c ){
            result = max;
        }else{
            result = c;
        }
        if (a == b && a == c){
            result = 0;
        }

        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a < b && a > c){
            result = a;
        }
        if (a > b && a < c){
            result = a;
        }
        if (b > c && b < a ){
            result = b;
        }
        if (b < c && b > a){
            result = b;
        }
        if (c > a && c < b){
            result = c;
        }
        if (c < a && c > b){
            result = c;
        }
        if (a == b && a == c){
            result = 0;
        }

        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        int min = 0;
        if(a < b){
            min = a;
        }else if (min < c ){
            result = min;
        }else{
            result = c;
        }
        if (a == b && a == c){
            result = 0;
        }

        return result;
    }
}
