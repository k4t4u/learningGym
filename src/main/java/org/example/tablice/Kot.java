package org.example.tablice;

import java.util.ArrayList;

public class Kot {
    public static ArrayList<Kot> koty = new ArrayList<>();

    public Kot() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            koty.add(new Kot());
        }
        printKoty();
    }

    public static void printKoty() {
        for (int i = 0; i < koty.size(); i++){
            System.out.println(koty.get(i));
        }
    }
}

