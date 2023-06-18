package org.example.setHashMap;

import java.util.HashMap;
import java.util.Map;

public class UsuwaDuplikatyWartosci {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("Anna", "Jakas");
        mapa.put("Hanna", "Inna");
        mapa.put("Barbara", "Armara");
        mapa.put("Aeda", "Aweffs");
        mapa.put("Daria", "Jakas");

        mapa.put("Julia", "Jakos");
        mapa.put("Marta", "Inna");
        mapa.put("Asia", "Armara");
        mapa.put("Justa", "Aweffs");
        mapa.put("Ola", "Jakos");

        return mapa;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        HashMap<String, String> copy = new HashMap<>(mapa);
        for (String copyName : copy.values()) {
            int count = 0;
            for (String name : mapa.values()) {
                if (name.equals(copyName)) {
                    count++;
                }
            }
            if (count > 1) {
                usunElementZMapPoWartosci(mapa, copyName);
            }
        }
    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc)) {
                mapa.remove(para.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
