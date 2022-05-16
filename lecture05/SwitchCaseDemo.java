package lecture05;

import java.util.Scanner;
class SwitchCaseDemo{
    
    public static void main(String args[]){ 
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        i = input.nextInt();
        switch (i){ 
        case 0: 
            System.out.println("i is zero."); 
            break; 
        case 1: 
            System.out.println("i is one."); 
            break; 
        case 2: 
            System.out.println("i is two."); 
            break; 
        default: 
            System.out.println("i is greater than 2."); 
        } 
    } 
} 