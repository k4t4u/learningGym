package org.example.arrayListIList;

import java.util.ArrayList;

public class TworzyTabliceTablicIDodajeElementy {

    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        ArrayList<String>[] result = (ArrayList<String>[]) new ArrayList[3];

        result[0] = new ArrayList<String>();
        result[1] = new ArrayList<String>();
        result[2] = new ArrayList<String>();

        result[0].add("Grand");
        result[1].add("Theft");
        result[2].add("Auto");

        return result;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}
