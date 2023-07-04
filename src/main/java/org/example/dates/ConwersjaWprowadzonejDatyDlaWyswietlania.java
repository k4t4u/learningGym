package org.example.dates;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConwersjaWprowadzonejDatyDlaWyswietlania {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataInput = reader.readLine();

        SimpleDateFormat simpleDataIn = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        Date dataOutput = simpleDataIn.parse(dataInput);

        SimpleDateFormat simpleDataOut = new SimpleDateFormat("d MMM yyyy", new Locale("pl"));

        System.out.println(simpleDataOut.format(dataOutput).toUpperCase());
    }
}
