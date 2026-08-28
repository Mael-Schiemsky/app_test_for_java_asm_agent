package org.example.classes.example;

import org.example.classes.model.GetOne;

public class ParameterExample {

    public static void run(
        boolean b, byte by, char c, short s, int i, float f, long l, double d, int[] a, GetOne p1){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I take many parameters: " + b + ", " + by + ", " + c + ", " + s +
                            ", " + i + ", " + f + ", " + l + ", " + d + ", " + a + ", " + p1);
    }
}
