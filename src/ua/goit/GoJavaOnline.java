package ua.goit;

import java.util.Scanner;

public class GoJavaOnline {
    public static void main ( String[] args ) {
        final Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Please, enter circul radius:" );
        double r = scanner.nextDouble();

        double area = 3.14 * r * r;

        System.out.printf ( "Circles area: " + area );
    }

}
