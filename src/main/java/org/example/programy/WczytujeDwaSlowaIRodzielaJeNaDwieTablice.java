package org.example.programy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WczytujeDwaSlowaIRodzielaJeNaDwieTablice {
    public static char[] samogloski = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        StringBuffer samogloski = new StringBuffer();
        StringBuffer spolgloski = new StringBuffer();

        for (char c : text.toCharArray()) {
            if (isSamogloska(c)) {
                samogloski.append(c).append(" ");
            } else if (c != ' ') {
                spolgloski.append(c).append(" ");
            }
        }

        System.out.println(samogloski);
        System.out.println(spolgloski);
    }

    public static boolean isSamogloska(char c) {
        c = Character.toLowerCase(c);

        for (char d : samogloski)
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}