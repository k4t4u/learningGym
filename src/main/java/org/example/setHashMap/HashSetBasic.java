package org.example.setHashMap;

import java.util.HashSet;

public class HashSetBasic {

    public static void main(String[] args) throws Exception {

        HashSet<String> fruits = new HashSet<>();
        fruits.add("arbuz");
        fruits.add("banan");
        fruits.add("wiśnia");
        fruits.add("gruszka");
        fruits.add("kantalupa");
        fruits.add("jeżyna");
        fruits.add("żeńszeń");
        fruits.add("truskawka");
        fruits.add("irys");
        fruits.add("ziemniak");


        for (String s : fruits) {
            System.out.println(s);
        }
    }
}
