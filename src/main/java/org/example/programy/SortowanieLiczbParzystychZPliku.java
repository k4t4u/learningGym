package org.example.programy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortowanieLiczbParzystychZPliku {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        Scanner scanner = new Scanner(inputStream);
        List<Integer> data = new ArrayList<Integer>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);
        }

        Collections.sort(data);

        for (Integer value : data)
            System.out.println(value);

        scanner.close();
        inputStream.close();
    }
}
