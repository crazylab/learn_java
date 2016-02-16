import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Console console = System.console();
        console.printf("Enter A String: ");
        String input = console.readLine();
        String_Data data = new String_Data(input);
        data.countVowels();

    }
}
