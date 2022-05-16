package lecture06;

import java.util.Scanner;
public class SimpleForExample{

    public static void main(String args[]){
        // print out even numbers up til 10
        for (int i = 1; i < 10; i = i+1) {
            System.out.println(i);
        }
        
        
        //print out the sum of first n numbers
        int sum = 1, n; 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number n: ");
        n = keyboard.nextInt();
        
        for (int x = 2; x <= n; x++) { 
            sum = sum + x; 
        } 
        System.out.println("Sum: " + sum); 
    
    }
}
