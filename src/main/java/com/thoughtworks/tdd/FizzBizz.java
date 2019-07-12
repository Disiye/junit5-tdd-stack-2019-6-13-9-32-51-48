package com.thoughtworks.tdd;

public class FizzBizz {

    public String convert(Integer number) {
        String result = "";
        if(number%3==0 || number%5==0 || number%7==0) {
            if(number % 3 == 0){
                result +="Fizz";
            }
            if(number % 5 == 0){
                result += "Bizz";
            }
            if(number % 7 == 0){
                result += "Whizz";
            }
            return result;
        }
        return number.toString();
    }
}
