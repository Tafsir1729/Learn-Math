
package MathLearning;

import java.util.Scanner;

public class Operation {
    Scanner sc = new Scanner(System.in);
    public int flag = 0;
    public String summary = "";
    
    
    
    public int score = 0;
    public void learnSum(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        System.out.println("What is "+num1+"+"+num2+"?");
        int userans = sc.nextInt();
        if(num1+num2 == userans){
            score++;
           // System.out.println("True");
            
        }
        else{
           // System.out.println("False");
           flag = 1;
            
        }
        summary += "\n"+num1+"+"+num2+"="+userans+":"+(num1+num2==userans);
        
        }
    public void learnSub(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
  
        if(num2>num1){
            int temp = num1;
            num1= num2;
            num2 = temp;
            }
        System.out.println("What is "+num1+"-"+num2+"?");
        int userans = sc.nextInt();
        if(num1-num2 == userans){
            score++;
            //System.out.println("True");
            }
        else
        {
        //System.out.println("False");
            flag = 1;
        }
        summary += "\n"+num1+"-"+num2+"="+userans+":"+(num1-num2==userans);
        
}
    public void learnMulti(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        System.out.println("What is "+num1+"*"+num2+"?");
        
        int userans = sc.nextInt();
        if(num1*num2==userans){
            score++;
           // System.out.println("True");
            
        }
        else{
            //System.out.println("False");
            flag = 1;
            
        }
        summary += "\n"+num1+"*"+num2+"="+userans+":"+(num1*num2==userans);
        
    }
    
    public void learnDiv(){
        int result;
        int userans;
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        if(num2>num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2!=0){
             result = (Math.round(num1/num2));
            
            
            System.out.println("What is "+num1+"/"+num2+" "+"?");
             userans = sc.nextInt();
             if(userans==result)
                 score++;
             else
                 flag = 1;
           
            
            summary += "\n"+num1+" "+num2+" "+"="+" "+userans+":"+(num1/num2==userans);
            

            
        }
    }
}

