package com.aditya.practise.java8.imp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class Java8Code 
{
    public static void main(String[] args) 
    {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         
        Integer secondLargestNumber = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
         
        System.out.println(secondLargestNumber);
    }
}