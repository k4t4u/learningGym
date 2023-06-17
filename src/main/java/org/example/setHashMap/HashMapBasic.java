package org.example.setHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {

    public static void main(String[] args) throws Exception {

        HashMap<String, String> fruits = new HashMap<>();

        fruits.put("arbuz", "melon");
        fruits.put("banan", "owoc");
        fruits.put("wiśnia", "owoc");
        fruits.put("gruszka", "owoc");
        fruits.put("kantalupa", "melon");
        fruits.put("jeżyna", "owoc");
        fruits.put("żeńszeń", "korzeń");
        fruits.put("truskawka", "owoc");
        fruits.put("irys", "kwiat");
        fruits.put("ziemniak", "bulwa");

        for (Map.Entry<String, String> pair : fruits.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
