package org.example.oOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DzisiejszaData {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
