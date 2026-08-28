package org.example.classes.example;

import org.example.classes.model.Count;

public class SwitchCaseExample {

    public static void run(){
        tableSwitchInt();
        System.out.println("");
        lookupSwitchInt();
        System.out.println("");
        switchByte();
        System.out.println("");
        switchEnum();
        System.out.println("");
        switchChar();
        System.out.println("");
        switchString();
        System.out.println("");
        switchInSwitch();
    }

    public static void tableSwitchInt() {
        int i = 3;
        switch (i) {
            case 1 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH case : 1");
            case 2 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH case : 2");
            case 3 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH case : 3");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH default case");
        }

        switch (i) {
            case 0,
                 1, 
                 2 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH case : 0, 1, 2");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH default case");
        }

        switch (i) {
            case 3,
                 4,
                 5 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] TABLESWITCH case : 3, 4, 5");
        }
    }

    public static void lookupSwitchInt() {
        int i = 3;

        switch (i) {
            case 0 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 0");
            case 82 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 82");
            case 3 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 3");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH default case");
        }
    
        int y = 78;
        switch (y) {
            case 5,
                 78, 
                 2 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 5, 78, 2");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH default case");
        }
    
        switch (i) {
            case 9 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 9");
            case 22 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 22");
        }

        switch (i) {
            case 0,
                 82,
                 3 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] LOOKUPSWITCH case : 0, 82, 3");
        }
    }

    public static void switchByte(){
        byte by = 0b10;

        switch (by) {
            case 0b10 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : 0b10");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }

        switch (by) {
            case 2 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : 0b10");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }
    }

    public static void switchEnum(){
        Count i = Count.Two;
        
        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH enum : " + i.toString());

        switch (i) {
            case One -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : One");
            case Two -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : Two");
            case Three -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : Three");
            case Four -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : Four");
        }

        int y = 3;
        switch (Count.values()[y]) {
            case Four -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : Four");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }
    }

    public static void switchChar(){
        char c = 'c';

        switch (c) {
            case 'c' -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : c");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }

        switch (c) {
            case 99 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : c");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }
    }

    public static void switchString(){
        String s = "ab";

        switch (s) {
            case "ab" -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : ab");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }

        switch (s) {
            case "cd" -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : cd");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }

        switch (s) {
            case "ef" -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : ef");
        }

        switch (s.hashCode()) {
            case 3105 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : ab");
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }

        switch (s.hashCode()) {
            case 3105 -> {
                if(s == "ab") System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH case : 3105 with IF : ab");
            }
            default -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH default case");
        }
    }

    public static void switchInSwitch(){
        int i = 0;
        int y = 1;
        switch (i) {
            case 0 -> {
                switch (y) {
                case 0 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH in SWITCH case : 00");
                case 1 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH in SWITCH case : 01");
                }
            }
            case 1 -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH not in SWITCH case : 1");
        }

        String s = "ab";
        String t = "ef";
        switch (s) {
            case "ab" -> {
                switch (t) {
                    case "ef" -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH in SWITCH case : abef");
                    case "gh" -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH in SWITCH case : abgh");
                }
            }
            case "cd" -> System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] SWITCH not in SWITCH case : cd");
        }
    }
}
