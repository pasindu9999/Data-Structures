package org.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

      /*  System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);*/

        colors[2] = "yellow";
        colors[2] = "red";
        for (String color : colors) {
            System.out.println(color);
        }

       /* for(int i= colors.length-1 ; i>=0; i--)
        {
            System.out.println(colors[i]);
        }*/

        //Arrays.stream(colors).forEach(System.out::println);

    }
}