package org.example.arrayListIList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TworzyListeNelementowIZnajdujeMin {

    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            Integer number = array.get(i);
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static List<Integer> getListaLiczbCalkowitych() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(i, Integer.parseInt(reader.readLine()));
        }
        return numbers;
    }
}
