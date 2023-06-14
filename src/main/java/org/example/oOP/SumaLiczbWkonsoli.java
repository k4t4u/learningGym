package org.example.oOP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumaLiczbWkonsoli {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;

        while (true) {
            String command = reader.readLine();
            if (command.equals("sumuj")) {
                System.out.println(suma);
                return;
            }
            int a = Integer.parseInt(command);
            suma += a;
        }
    }
}
