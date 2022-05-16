package Lecture07;


import java.time.*;
public class AppendExample{
    
   public static void main(String[] args){
       // Part 1: create a new StringBuilder.
       StringBuilder builder = new StringBuilder();
       
       // ... Loop and append values.
       for (int i = 0; i < 10; i++) {
            builder.append(i);
            builder.append(" ");
       }

       // Part 2: convert to string.
       String result = builder.toString();
       // ... Print result.
       System.out.println(result);
       System.out.println(builder);
       //or
       System.out.println(builder.toString());
   }
}
