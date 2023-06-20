package org.example.stos;

public class LogowanieSladuStosu {

    public static void main(String[] args) {
        log("W metodzie main");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        String message = className + ": " + methodName + ": " + s;
        System.out.println(message);
    }
}
