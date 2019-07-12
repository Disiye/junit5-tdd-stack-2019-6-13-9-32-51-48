package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBizzTest {
    @Test
    public void should_return_1_when_number_is_1() {
        //given
        Integer number = 1;
        FizzBizz fizzBizz =new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_number_is_3() {
        //given
        Integer number = 3;
        FizzBizz fizzBizz =new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("Fizz", result);
    }
}
