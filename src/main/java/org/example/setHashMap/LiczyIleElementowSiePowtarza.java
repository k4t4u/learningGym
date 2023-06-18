package org.example.setHashMap;

import java.util.HashMap;

public class LiczyIleElementowSiePowtarza {

    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> list = new HashMap<>();
        list.put("Kowaliski", "Ham");
        list.put("Aedsx", "dsw");
        list.put("Sdvcs", "Awdc");
        list.put("Sefx", "Scs");
        list.put("Sdcsa", "Sdvv");

        list.put("Xdfg", "Awe");
        list.put("Aqwe", "Dsa");
        list.put("Vsdfg", "Aweds");
        list.put("Vcssd", "Awet");
        list.put("Svntd", "Sddsc");

        return list;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        int count = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(imie)) {
                count++;
            }
        }
        return count;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        int count = 0;
        for (String lastName : map.keySet()) {
            if (lastName.equals(nazwisko)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
