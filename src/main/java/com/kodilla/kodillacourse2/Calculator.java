package com.kodilla.kodillacourse2;

import java.util.Scanner;

/**
 * Created by Bartosz Biernacki.
 */
public class Calculator {

    public static void main(String args[]) {
        Scanner Licz = new Scanner(System.in);
        double number1, number2, sum;

        System.out.println("Dodawanie;");
        System.out.println();

        System.out.println("Podaj pierwszą liczbę: ");
        number1 = Licz.nextDouble();

        System.out.println("Podaj drugą liczbę: ");
        number2 = Licz.nextDouble();

        sum = number1 + number2;

        System.out.println("liczba 1 + liczba 2 = " + sum);
        System.out.println();


        System.out.println("Odejmowanie;");
        System.out.println();

        System.out.println("Podaj pierwszą liczbę: ");
        number1 = Licz.nextDouble();

        System.out.println("Podaj drugą liczbę: ");
        number2 = Licz.nextDouble();

        double substract = number1 - number2;
        System.out.println("liczba 1 + liczba 2 = " + substract);

    }

}