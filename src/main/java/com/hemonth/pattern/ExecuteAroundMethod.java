package com.hemonth.pattern;

import java.util.function.Consumer;

public class ExecuteAroundMethod {

    private ExecuteAroundMethod() {
    }

    public void method1() {
        System.out.println("method1 called...");
    }

    public void method2() {
        System.out.println("method2 called...");
    }

    private void close() {
        System.out.println("closing all resources..");
    }

    public static void execute(Consumer<ExecuteAroundMethod> consumer) {
        ExecuteAroundMethod executeAround = new ExecuteAroundMethod();
        try {
            consumer.accept(executeAround);
        } finally {
            executeAround.close();
        }
    }
}
