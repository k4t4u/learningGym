package org.example.dates;

import java.util.Date;

public class ObliczaOdPoczatkuRokuDzienParzystyCzyNie {

    public static void main(String[] args) {

        System.out.println(isDataNieparzysta("MAY 1 2013"));
        System.out.println(isDataNieparzysta("MAY 2 2013"));
    }

    public static boolean isDataNieparzysta(String date) {
        Date nowDate = new Date(date);
        Date startDate = new Date(date);

        startDate.setDate(1);
        startDate.setMonth(0);

        long time = nowDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;

        return days % 2 == 1;
    }
}
