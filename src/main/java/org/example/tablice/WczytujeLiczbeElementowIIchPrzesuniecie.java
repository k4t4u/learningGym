package org.example.tablice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WczytujeLiczbeElementowIIchPrzesuniecie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String txt = reader.readLine();
            list.add(txt);
        }

        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
