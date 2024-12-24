package org.chelobyte.library.misc;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static String input() {
        return scanner.nextLine();
    }

    public static void close() {
        scanner.close();
    }

}
