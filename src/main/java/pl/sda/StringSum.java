package pl.sda;

import java.util.Scanner;

public class StringSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadź ciąg znaków:");

        String input = sc.next();

        int suma = 0;
        String s = input.replaceAll("--", "- -");
        s = s.replaceAll("[^0-9\\-]", " ");
        s = s.replaceAll("-", " - ");
        s = s.replaceAll("  ", " ");

        String[] s1 = s.split(" ");
        for (String number : s1) {
            if (!number.isEmpty()){
                suma += Integer.parseInt(number);
            }
        }
        System.out.println(suma);
    }



}
