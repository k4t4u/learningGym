package org.example.arrayListIList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WczytujeStringIZamieniaPierwszaLitereNaDuza {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringBuffer reload = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char up = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            reload.append(up);
        }
        System.out.println(reload);
    }
}
