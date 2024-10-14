package io.github.patrikalm;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String sentence = "Oil and Water";

        String oil = sentence.substring(0, 4);

        String water = sentence.substring(8);

        String[] array = {oil, water};

        System.out.println(oil);

        System.out.println(water);

        for (String s : array) {
            System.out.println(s);
        }




    }
}