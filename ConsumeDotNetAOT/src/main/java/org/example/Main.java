package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java prints to console");

        System.out.println("---------------- Demo DotNet Begins -----------------");
        int result = DotNetWrap.INSTANCE.aotsample_add(1,1); // 1 + 1 = 2 please god.
        System.out.println( "DotNet returned an int: " + result);
        DotNetWrap.INSTANCE.aotsample_write_line("Hello from DotNet!");
        String concatString = DotNetWrap.INSTANCE.aotsample_sumstring("DotNet ", "Returned a String!");
        System.out.println(concatString);

        System.out.println("---------------- Demo Go Begins ---------------------");
        GoWrap.INSTANCE.printHello();
        String helloWorld = GoWrap.INSTANCE.getHello();
        System.out.println(helloWorld);
    }
}