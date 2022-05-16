package lecture05;

import java.util.Scanner;
public class DebugFive3 {
    
   public static void main (String args[]){
      int points;
      char grade;

      Scanner input = new Scanner(System.in);
      System.out.print("Please enter earned number of points: ");
      points = input.nextInt();
      if(points >= 91){
         grade = 'A';
      }else if(points >= 81){
          grade = 'B';
      }else if(points >= 71){
          grade = 'C';
      }else if(points >= 61){
          grade = 'D';
      }else if(points >= 51){
          grade = 'E';
      }else {
          grade = 'F';
      }
      System.out.println("You earned the following grade: " + grade);
   }
}

