package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;


public class Lazy {
    public static void main(String[] args) {
    String[] names =  {"Ivan", "Victor"};
    Comparator<String> lengthCmp = (left, right) -> {
        System.out.println("execute comparator");
        return left.length() - right.length();
    };
        Arrays.sort(names, lengthCmp);
    }
}