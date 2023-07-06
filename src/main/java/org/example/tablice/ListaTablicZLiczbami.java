package org.example.tablice;

import java.util.ArrayList;

public class ListaTablicZLiczbami {

    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista() {
        ArrayList<int[]> lista = new ArrayList<int[]>();

        lista.add(new int[]{1, 2, 3, 4, 5});
        lista.add(new int[]{6, 7});
        lista.add(new int[]{8, 9, 10, 11});
        lista.add(new int[]{12, 13, 14, 15, 16, 17, 18});
        lista.add(new int[]{});
        return lista;
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
