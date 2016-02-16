import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Console console = System.console();
        console.printf("Enter A String: ");
        String input = console.readLine();

        String_Method sMethod = new String_Method();
        sMethod.print(input + " has " + sMethod.countVowels(input) + " Vowels");
        sMethod.print(input + " has " + sMethod.countConsonants(input) + " Consonants");
    }
}
