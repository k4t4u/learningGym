package org.example.exceptions;

public class WyjatkiTypuUncheckedAndStos {
    public static void main(String[] args) {
        obslugaExceptions(new WyjatkiTypuUncheckedAndStos());
    }

    public static void obslugaExceptions(WyjatkiTypuUncheckedAndStos obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException e) {
            printStos(e);
        }
    }

    public static void printStos(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

