package org.example.classes.example;

import org.example.classes.model.GetOne;
import org.example.classes.model.PlusOne;

public class ReturnExample {
    private static boolean b = false;
    private static byte by = 0010;
    private static char c = 'c';
    private static short s = 0;
    private static int i = 1;
    private static float f = 1.5f;
    private static long l = 2L;
    private static double d = 2.5;
    private static int[] a = {1, 2, 3};
    private static GetOne p1 = new PlusOne();

    public static void run(){
        returnBoolean();
        returnByte();
        returnChar();
        returnShort();
        returnInt();
        returnLong();
        returnFloat();
        returnDouble();
        returnArray();
        returnObject();
        returnVoid();
    }

    private static boolean returnBoolean(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Boolean: " + b);
        return b;
    }

    private static byte returnByte(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Byte: " + by);
        return by;
    }

    private static char returnChar(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Char: " + c);
        return c;
    }

    private static short returnShort(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Short: " + s);
        return s;
    }

    private static int returnInt(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return an Int: " + i);
        return i;
    }

    private static long returnLong(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Long: " + l);
        return l;
    }

    private static float returnFloat(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Float: " + f);
        return f;
    }

    private static double returnDouble(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Double: " + d);
        return d;
    }

    private static int[] returnArray(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return an Array: " + a);
        return a;
    }

    private static GetOne returnObject(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return an Object: " + p1);
        return p1;
    }

    private static void returnVoid(){
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] I return a Void");
        return;
    }
}
