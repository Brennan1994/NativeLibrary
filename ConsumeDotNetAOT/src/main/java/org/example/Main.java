package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java works fine");
        int result = DotNetWrap.INSTANCE.aotsample_add(1,1); // 1 + 1 = 2 please god.
        System.out.println("Who cares, we didn't break! But the answer was " + result);
    }
}