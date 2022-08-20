package main.java.models;

import java.util.Scanner;

public class Reader {
    static Scanner scanner = new Scanner(System.in);

    public static String readUserInput() {
        return scanner.nextLine();
    }
}
