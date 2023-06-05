package org.example.oOP;

/*
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sredniaArytmetyczna {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double howMany = 0;

        while (true) {
            double number = Double.parseDouble(reader.readLine());

            if (number == -1) {
                System.out.println(sum / howMany);
                return;
            }
            howMany++;
            sum += number;

        }
    }
}
