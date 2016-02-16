import java.io.*;
import java.util.Scanner;

public class Locker{
    public static void main(String[] args) {
        Console console = System.console();
        console.printf("Enter Site URL: ");
        String url = console.readLine();
        console.printf("Enter Username: ");
        String username = console.readLine();
        console.printf("Enter Password: ");
        String password = console.readLine();
        Credential first = new Credential(url, username, password);
        first.print();
    }
}
