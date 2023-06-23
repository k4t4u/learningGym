package org.example.exceptions;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class ObslugaWyjatkowILogowanie {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {

        try {
            obslugaExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
        }
    }

    public static void obslugaExceptions() throws FileSystemException {
        try {
            BEAN.throwExceptions();
        } catch (FileSystemException exception) {
            BEAN.log(exception);
            throw exception;
        } catch (IOException exception) {
            BEAN.log(exception);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            }
            if (i == 1) {
                throw new FileSystemException("");
            }
            if (i == 2) {
                throw new IOException();
            }
        }
    }
}
