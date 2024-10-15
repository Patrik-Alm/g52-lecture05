package io.github.patrikalm;


public class Main {
    public static void main(String[] args) {

       /* String line = "ThisShouldBeConverted";

        char[] charArray = line.toCharArray();

        for (char i : charArray) {
            System.out.println(i);
        } */

        char[] myArray = new char[]{'J', 'a', 'v', 'a'};
        String myLine = "";

        System.out.print(myArray);
        System.out.println(" from Char Array");

        for(char i : myArray) {

            myLine = myLine + i;

            }

        System.out.println(myLine + " from String variable");

    }
}