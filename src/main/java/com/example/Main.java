package com.example;

/**
 * 仮プロダクトコード
 */
public class Main {

    public String greet(String name) {
        StringBuilder builder = new StringBuilder();

        builder.append("Hello, ");
        builder.append(name);
        builder.append('.');

        return builder.toString();
    }
}
