package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkWithLists {
    public static void main(String[] args) {
        List<String> colorsUnmodify= List.of(
                "blue",
                "yellow"
        );
        colorsUnmodify.add("pink");

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors);

        for(String color : colors)
        {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i=0; i<colors.size();i++)
        {
            System.out.println(colors.get(i));
        }
    }
}
