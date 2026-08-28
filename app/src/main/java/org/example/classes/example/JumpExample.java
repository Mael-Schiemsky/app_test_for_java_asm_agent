package org.example.classes.example;

public class JumpExample {

    public static void run(){
        ifCase();
        System.out.println("");
        elseCase();
        System.out.println("");
        whileCase();
        System.out.println("");
        doWhileCase();
        System.out.println("");
    }

    public static void ifCase(){
        int i = 0;
        int y = 1;
        String s1 = null;
        String s2 = "ab";

        if(i == 0){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT single var");
        }

        if(i < 1 && y >= 1){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT AND");
        }

        if(i <= 0 || y > 0){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT OR");
        }

        if(i != y){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT double var");
        }

        if(i != 1){
            if(y == 1){
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT nested");
            }
        }

        if(i == 0 || y == 1){
            if(i == 0){
                if(i == 0 && y == 0 || i < y){
                    System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT nested 2");
                }
                if(y != 0){
                    System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF INT nested 3");
                }
            }
        }

        if(s1 == null){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF OBJ single var");
        }

        s1 = "ab";

        if(s1 == s2){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF OBJ double var");
        }
    }

    public static void elseCase(){
        int i = 0;

        if(i == 1);
        else System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] ELSE");
        
        if(i == 0 && i == 1);
        else System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] ELSE AND");

        if(i == 1 || i == 2);
        else System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] ELSE OR");

        if(i == 1);
        else if(i == 2);
        else System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] ELSE IF");

        if(i == 0)
            if(i == 1);
            else System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] ELSE nested");
    }

    public static void whileCase(){
        int a = 0;
        int b = 0;

        while(a < 1){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] WHILE n°it : " + a);
            a++;
        }
        System.out.println("");

        a = 0;
        while(b == 0 && a < 1){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] WHILE comp n°it : " + a);
            a++;
        }
        System.out.println("");

        for(int i = 0; i < 1; i++){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] FOR n°it : " + i);
        }
        System.out.println("");

        a = 0;
        while(a < 2){
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] fst WHILE n°it : " + a);
            while(b < 1){
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] snd WHILE n°it : " + b);
                b++;
            }
            b = 0;
            a++;
        }
        System.out.println("");

        a=0;
        if(a==0){
            while(a < 1){
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF with WHILE n°it : " + a);
                a++;
            }
        }
        System.out.println("");

        if(a==0);
        else{
            a=0;
            while(a < 1){
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] ELSE with WHILE n°it : " + a);
                a++;
            }
        }
        System.out.println("");

        a=0;
        while(a < 1){
            if(b==0){
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] WHILE with IF n°it : " + a);
            }
            a++;
        }
    }

    public static void doWhileCase(){
        int a = 0;
        int b = 0;

        do{
            System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] DO WHILE n°it : " + a);
            a++;
        }while(a < 2);
        System.out.println("");

        a = 0;
        do{
            b = 0;
            do{
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] DO WHILE nested n°it : " + b);
                b++;
            }while(b < 2);
            a++;
        }while(a < 2);
        System.out.println("");

        a = 0;
        if(a == 0){
            do{
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] DO WHILE nested IF n°it : " + a);
                a++;
            }while(a < 2);
        }
        System.out.println("");
        
        b = 0;
        do{
            if(b == 0){
                System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] IF nested DO WHILE n°it : " + a);
            }
            a++;
        }while(a < 2);
    }
}
