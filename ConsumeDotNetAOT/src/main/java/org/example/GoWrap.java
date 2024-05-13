package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface GoWrap extends Library {
    String pathToLib = "C:\\Programs\\Git\\Repos\\NativeLibrary\\ConsumeDotNetAOT\\src\\main\\resources\\hwamd64.dll";
    GoWrap INSTANCE = Native.load(pathToLib, GoWrap.class);

    void printHello();
    String getHello();
}
