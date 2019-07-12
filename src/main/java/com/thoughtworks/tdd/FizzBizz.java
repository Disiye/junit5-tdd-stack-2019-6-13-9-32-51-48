package com.thoughtworks.tdd;

public class FizzBizz {

    public String convert(Integer number) {
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Bizz";
        }
        return number.toString();
    }
}
