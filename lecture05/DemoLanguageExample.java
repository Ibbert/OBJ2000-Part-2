package lecture05;


import java.util.Scanner;
public class DemoLanguageExample{
    public static void main(String args[]){
    
        String lang;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a language shortcut: ");
        lang = input.next();
        switch (lang) {
            case "en":
                System.out.println("English");
                break;
            case "fr":
                System.out.println("French");
                break;
            case "de":
                System.out.println("Deutsch");
                break;
            default:
                System.out.println("Language not supported");
        }
    }
}
