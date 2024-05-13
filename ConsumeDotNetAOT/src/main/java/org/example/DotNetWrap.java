package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface DotNetWrap extends Library {
    String pathToLib = "C:\\Programs\\Git\\Repos\\NativeLibrary\\NativeLibrary\\bin\\Release\\net8.0\\win-x64\\native\\NativeLibrary.dll";
    DotNetWrap INSTANCE = Native.load(pathToLib, DotNetWrap.class);

    int aotsample_add(int a, int b);

    int aotsample_write_line(String s);

    String aotsample_sumstring(String one, String two);
}

