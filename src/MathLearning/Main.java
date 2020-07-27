
package MathLearning;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.println("How many questions do you want?");
        //int que_no = input.nextInt();
        Operation op = new Operation();
        
        do{
           int rand = (int)(Math.random()*4);
           switch(rand){
               case 0:
                   op.learnSum();
                   break;
               case 1:
                   op.learnSub();
                   break;
               case 2:
                   op.learnMulti();
                   break;
               case 3:
                   op.learnDiv();
                   break;
           
           }
            
            
        }while(op.flag!=1);
        System.out.println("!!!Game Over!!!");
        
        System.out.println("Your score is "+op.score);
        System.out.println("Summary:"+op.summary);
        
        
        
        
     
    }
    
}

    

