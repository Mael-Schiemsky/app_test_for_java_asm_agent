package org.example.classes.example;

public class MethodA {
    public int methodA(int var){
        int sum = 0;
        int i = 0;
        int y = 0;

        while(i <= var){
            if(var < 4){
                y++;
            } else {
                sum -= 1;
            }

            sum += var;
            sum += y;
            i++;
        }

        return sum;
    }

    public void methodB(){
        String str = "ab";


        switch(str){
            case "ab" :
                System.out.println("ab");
                break;
            default :
                System.out.println("default");
        }



        int eq = -1;
        switch(str.hashCode()){
            case 3105 : 
                if(str.equals("ab")){
                    eq = 0;
                }
            default :
                switch(eq){
                    case 0 :
                        System.out.println("ab");
                        break;
                    default : System.out.println("default");
                }
        }


        eq = -1;
        switch(str.hashCode()){
            case 3105 :
                if(eq==0){
                    System.out.println("3105");
                }
                break;
            default :
                switch(eq){
                    case 0 :
                        System.out.println(str);
                        break;
                    default : System.out.println("default");
                }
        }                
    }
}


