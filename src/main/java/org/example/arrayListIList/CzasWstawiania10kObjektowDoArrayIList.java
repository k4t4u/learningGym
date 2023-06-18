package org.example.arrayListIList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CzasWstawiania10kObjektowDoArrayIList {

    public static void main(String[] args) {
        System.out.println(getCzasWstawienWms(new ArrayList()));
        System.out.println(getCzasWstawienWms(new LinkedList()));
    }

    public static long getCzasWstawienWms(List lista) {
        Date data1 = new Date();

        wstaw10000(lista);

        Date data2 = new Date();
        return data2.getTime() - data1.getTime();

    }

    public static void wstaw10000(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(0, new Object());
        }
    }
}
