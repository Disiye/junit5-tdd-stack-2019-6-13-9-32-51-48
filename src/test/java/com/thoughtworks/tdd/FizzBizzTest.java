package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBizzTest {
    @Test
    public void should_return_1_when_number_is_1() {
        //given
        Integer number = 1;
        FizzBizz fizzBizz = new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_number_is_3() {
        //given
        Integer number = 3;
        FizzBizz fizzBizz = new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_bizz_when_number_is_5() {
        //given
        Integer number = 5;
        FizzBizz fizzBizz = new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("Bizz", result);
    }

    @Test
    public void should_return_whizz_when_number_is_7() {
        //given
        Integer number = 7;
        FizzBizz fizzBizz = new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_fizzbizz_when_number_is_15() {
        //given
        Integer number = 15;
        FizzBizz fizzBizz = new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("FizzBizz", result);
    }

    @Test
    public void should_return_fizzbizzwhizz_when_number_is_105() {
        //given
        Integer number = 105;
        FizzBizz fizzBizz = new FizzBizz();
        //when
        String result = fizzBizz.convert(number);
        //then
        Assertions.assertEquals("FizzBizzWhizz", result);
    }
}
