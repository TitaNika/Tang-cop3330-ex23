/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment23 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        char branch;

        System.out.print("Is the car silent when you turn the key? ");

        branch = scan.next().charAt(0);

        if (branch == 'y') {

            System.out.print("Are the Battery terminals corroded? ");

            branch = scan.next().charAt(0);

            if (branch == 'y')

                System.out.println("Battery may not be clean. Clean the terminals and try starting again.");

            else

                System.out.println("The battery cables may be damaged. Replace cables and try again.");
        }

        else {

            System.out.print("Does the car make a slicking noise? ");

            branch = scan.next().charAt(0);

            if (branch == 'y')

                System.out.println("Battery may be damaged. Replace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                branch = scan.next().charAt(0);

                if (branch == 'y')

                    System.out.println("Spark plug connection may be loose. Check spark plug connection.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    branch = scan.next().charAt(0);

                    if (branch == 'y') {

                        System.out.println("Does your car have fuel injection? ");

                        branch = scan.next().charAt(0);

                        if (branch == 'y')

                            System.out.println("Get in it for service.");

                        else

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.println("This should not be possible.");

                    }

                }

            }

        }

        scan.close();
    }

}