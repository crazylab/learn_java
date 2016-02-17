import java.io.*;
import java.util.Scanner;

public class Main{
    static void showOptions(){
        String[] options = {
            "Count Vowels",
            "Count Consonants"
        };
        System.out.println();
        for(int index = 0; index < options.length; index++){
            System.out.println((index+1) + ". " + options[index]);
        }
    }
    public static void main(String[] args) {
        Console console = System.console();
        String_Method sMethod = new String_Method();
        boolean repeat;
        do{
            console.printf("Enter A String: ");
            String input_string = console.readLine();
            showOptions();
            console.printf("--> Select an operation from above to perform: ");
            String operation = console.readLine();

            switch(Integer.parseInt(operation)){
                case 1 :    sMethod.print("\n" + input_string + " has " + sMethod.countVowels(input_string) + " Vowels");
                            break;
                case 2 :    sMethod.print("\n" + input_string + " has " + sMethod.countConsonants(input_string) + " Consonants");
                            break;
                default:    sMethod.print("\nPlease select a valid option");
            }

            console.printf("\nWant to continue ?(y/n) ");
            input_string = console.readLine();
            repeat = input_string.charAt(0) == 'y';
        }while(repeat);
    }
}
