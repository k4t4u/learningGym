package org.example.tablice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTworzyTabliceIDzieliElementyNaTrzyTablice {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = mainList.get(i);
            if ((x % 3 == 0) || (x % 2 == 0)) {
                if (x % 3 == 0) {
                    divByThree.add(x);
                }
                if (x % 2 == 0) {
                    divByTwo.add(x);
                }
            } else {
                rest.add(x);
            }
        }
        printLista(divByThree);
        printLista(divByTwo);
        printLista(rest);
    }

    public static void printLista(List<Integer> lista) {
        for (Integer x : lista)
            System.out.println(x);
    }
}
