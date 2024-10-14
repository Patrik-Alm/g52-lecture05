package io.github.patrikalm;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String names = "Carl,Susie,Fredrick,Bob,Erik";

        String regex = ",";

        String[] myArray = names.split(regex);

        for(String s : myArray) {
            System.out.println(s);
        }





    }
}