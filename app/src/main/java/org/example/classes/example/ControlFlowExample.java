package org.example.classes.example;

import org.example.classes.model.GetOne;
import org.example.classes.model.PlusOne;
import org.example.classes.model.PlusTwo;

public class ControlFlowExample {

    public static void run(){
        GetOne g1 = new PlusOne();
        GetOne g2 = new PlusTwo();
        int count = 0;

        for(int i = 0; i < 4; i++){
            if(i % 2 == 0){
                count += g1.increment();
            } else {
                count += g2.increment();
            }
        }

        System.out.println("[\u001B[3m"+ "APP" + "\u001B[0m] Count: " + count);

        MethodA mA = new MethodA();
        mA.methodA(0);
    }
}
