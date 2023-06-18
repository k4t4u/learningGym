package org.example.setHashMap;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class SprawdzaWarunekIUsuwaElementyMapy {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();

        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));
        mapa.put("Ktos", df.parse("LIPIEC 4 1234"));
        mapa.put("KtosInny", df.parse("MAJ 13 2021"));
        mapa.put("Jeszcze", df.parse("LUTY 1 1090"));
        mapa.put("Sawefs", df.parse("CZERWIEC 1 1980"));

        mapa.put("CVssdf", df.parse("LIPIEC 1 1234"));
        mapa.put("Secgy", df.parse("MAJ 23 2021"));
        mapa.put("Sawqccc", df.parse("LIPIEC 1 1234"));
        mapa.put("Sadca", df.parse("MAJ 23 2021"));
        mapa.put("Ssddfreh", df.parse("LUTY 1 1090"));

        return mapa;
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        HashMap<String, Date> copy = new HashMap<>(mapa);

        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                mapa.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
