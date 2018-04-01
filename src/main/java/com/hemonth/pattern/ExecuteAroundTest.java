package com.hemonth.pattern;

public class ExecuteAroundTest {
    public static void main(String[] args) {
        ExecuteAroundMethod.execute(ExecuteAroundMethod::method1);

        ExecuteAroundMethod.execute(executeAroundMethod ->{
            executeAroundMethod.method1();
            executeAroundMethod.method2();
        });
    }
}
