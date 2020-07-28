package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {
    private static String input01 = "racecar";

    @Test
    public void isPalindroneTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        Boolean actual = practiceProblem01.isPalindrone(input01);
        Assert.assertTrue(actual);
    }

    public void getSubPalindronesTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a c e c a r";
        String actual = practiceProblem01.getSubPalindromes(input01);
        Assert.assertEquals(expected, actual);
    }
}
