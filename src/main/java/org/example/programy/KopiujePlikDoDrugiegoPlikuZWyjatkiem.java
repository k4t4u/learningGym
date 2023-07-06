package org.example.programy;

import java.io.*;

public class KopiujePlikDoDrugiegoPlikuZWyjatkiem {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String plikZrodlowyNazwa = reader.readLine();

        InputStream fileInputStream = null;

        try {
            fileInputStream = getInputStream(plikZrodlowyNazwa);

        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje.");
            plikZrodlowyNazwa = reader.readLine();
            fileInputStream = getInputStream(plikZrodlowyNazwa);
        }

        String plikDocelowyNazwa = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(plikDocelowyNazwa);

        while (fileInputStream.available() > 0) {
            int dane = fileInputStream.read();
            fileOutputStream.write(dane);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String nazwaPliku) throws IOException {
        return new FileInputStream(nazwaPliku);
    }

    public static OutputStream getOutputStream(String nazwaPliku) throws IOException {
        return new FileOutputStream(nazwaPliku);
    }
}
