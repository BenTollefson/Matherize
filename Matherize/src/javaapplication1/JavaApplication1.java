/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random; 
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //inputAllBaseTypes();
        //isMultiple();
        //isEven();
        for(int x = 0; x <10; x++){
        functionSolving(); //ax + b = c
        }
        
        
    }
    public static void expandedFunctionSolving(){
        
    }
    
    public static void functionSolving(){
        //print to screen a function with x and if the enter key is pressed, show solution
        int score = 0;
        int a = 0, b =0, c =0, x =0; // variables for ax + b = c, solve for x
        int numberRange = 10;
        Random rand = new Random(); 
        a = rand.nextInt(numberRange); //TODO problem if a is zero -- impossible to know what x is.
        b = rand.nextInt(numberRange);
        c = rand.nextInt(numberRange); //this variable should actually be set to the solution.
        x = rand.nextInt(numberRange); 
        c = (a*x + b);
        System.out.printf("%d * x + %d = %d\n", a, b, c);
        Scanner input = new Scanner(System.in);
        String inputString;
        int inputInt;
        System.out.print("x = ");
        inputInt = input.nextInt();
        if(inputInt == x)
            switch (score){
                case 0: System.out.print("nice\n");
                        break;
                        case 2: System.out.print("very good\n");
                        break;
                        case 4: System.out.print("sweet\n");
                        break;
                        case 9: System.out.print("spectacular\n");
                        break;
                default:System.out.print("good job\n");
                        break;
            }
        else
            System.out.print("yup, nope, you suck.\n");
        inputString = input.nextLine();
        
        //if(inputString.equals(""))  //if the enter key is pressed, print.
          //  System.out.print("hold up");
        //inputString = input.next();
        
    
    }
    
    public static boolean isEven(){
        
        int n;
        Scanner evenScan = new Scanner(System.in);
        System.out.print("enter an int\n");
        n = evenScan.nextInt();
        if(n%2 == 0){
            System.out.print(n + " is even\n");
            return true;
        }
        else{
            System.out.print(n + " is odd\n");
            return false;
        }
        
    }
    
    public static boolean isMultiple(){
        long n = 1,m = 1;
        Scanner scanLong = new Scanner(System.in);
        System.out.print("enter a number\n");
        try{
        n = scanLong.nextLong();
        
        System.out.print("test a number to see if it is a divisor\n");
        m = scanLong.nextLong();
        }
        catch(Exception all)
        {
            System.out.print("something went wrong, probably your fault");
        }
        if (n%m == 0 && m != 0)
        {
            System.out.print(m + " is a divisor of " + n +" and it equals " + (n/m) + "\n");
        }
        return true;
    }
    
    public static void inputAllBaseTypes(){
        boolean y = false;
        try{
            System.out.print("enter an boolean:");
            Scanner scan = new Scanner(System.in);
            boolean bool = scan.nextBoolean();
            System.out.print("enter a byte:");
            byte byte1 = scan.nextByte();
            System.out.print("enter a short:");
            short short1 = scan.nextShort();
            System.out.print("enter a int:");
            int int1 = scan.nextInt();
            System.out.print("enter a long:");
            long long1 = scan.nextLong();
            System.out.print("enter a float:");
            float float1 = scan.nextFloat();
            System.out.print("enter a double:");
            double double1 = scan.nextDouble();
            System.out.print("enter a char:");
            String char1 = scan.next();
            //System.out.print(bool);
            y = true;
            
        }catch(Exception e){
            //System.out.print("enter a bool!");
            
        }
        if(y == false)
        {
            inputAllBaseTypes();
        }
        }
        
    
    }
    
    

