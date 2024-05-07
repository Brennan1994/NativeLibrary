package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java");
        int result = DotNetWrap.INSTANCE.aotsample_add(1,1); // 1 + 1 = 2 please god.
        System.out.println( "DotNet returned an int: " + result);
        int successIs0 = DotNetWrap.INSTANCE.aotsample_write_line("Hello from DotNet!");
        String concatString = DotNetWrap.INSTANCE.aotsample_sumstring("DotNet ", "Returned a String!");
        System.out.println(concatString);
    }
}