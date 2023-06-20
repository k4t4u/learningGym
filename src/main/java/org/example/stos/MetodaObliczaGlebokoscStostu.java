package org.example.stos;

public class MetodaObliczaGlebokoscStostu {
    public static void main(String[] args) throws Exception {
        int glebokosc = getGlebokoscStosu();
    }

    public static int getGlebokoscStosu() {
        int length = Thread.currentThread().getStackTrace().length;
        System.out.println(length);

        return length;
    }
}
