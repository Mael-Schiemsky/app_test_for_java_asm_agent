package org.example;

import org.example.classes.example.ControlFlowExample;
import org.example.classes.example.JumpExample;
import org.example.classes.example.ParameterExample;
import org.example.classes.example.ReturnExample;
import org.example.classes.example.SwitchCaseExample;
import org.example.classes.model.GetOne;
import org.example.classes.model.PlusOne;

public class App {
    
    public static void main(String[] args) {
        boolean b = false;
        byte by = 0010;
        char c = 'c';
        short s = 0;
        int i = 1;
        float f = 1.5f;
        long l = 2L;
        double d = 2.5;
        int[] a = {1, 2, 3};
        GetOne g1 = new PlusOne();

        String params = "";
        // Check if any parameters were passed
        if(args.length > 0){
           params = args[0];
        }

        if(params.contains("p")){
            System.out.println("\n[\u001B[3m"+ "APP" + "\u001B[0m] ParameterExample");
            ParameterExample.run(b, by, c, s, i, f, l, d, a, g1);
        }

        if(params.contains("j")){
            System.out.println("\n[\u001B[3m"+ "APP" + "\u001B[0m] JumpExample");
            JumpExample.run();
        }

        if(params.contains("s")){
            System.out.println("\n[\u001B[3m"+ "APP" + "\u001B[0m] SwitchCaseExample");
            SwitchCaseExample.run();
        }
        
        if(params.contains("r")){
            System.out.println("\n[\u001B[3m"+ "APP" + "\u001B[0m] ReturnExample");
            ReturnExample.run();
        }

        if(params.contains("f")){
            System.out.println("\n[\u001B[3m"+ "APP" + "\u001B[0m] ControlFlowExample");
            ControlFlowExample.run();
        }
    }
}
