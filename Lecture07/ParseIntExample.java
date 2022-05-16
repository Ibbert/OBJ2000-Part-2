package Lecture07;

import javax.swing.*;
public class ParseIntExample{
    
    

   public static void main(String[] args){
         String name;
         String age;
         int properAge;
         name = JOptionPane.showInputDialog(null,
            "Please enter your name");
         age = JOptionPane.showInputDialog(null,
            "Please enter your age");
         try {
            properAge = Integer.parseInt(age);
                  JOptionPane.showMessageDialog(null,
                  "Dear " + name +
                  ",\nin ten years you will be " + (properAge +10) +
                  " years old");
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Wrong format!");
         }
            
   }
   
}
