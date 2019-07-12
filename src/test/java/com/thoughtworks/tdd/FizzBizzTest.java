package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBizzTest {
    @Test
    public void should_return_1_when_number_is_1() {
        //given
        int number = 1;
        FizzBizz fizzBizz =new FizzBizz();

        //when
        String result = fizzBizz.convert(number);

        //then
        Assertions.assertEquals("1", result);
    }
}
