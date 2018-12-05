package com.lowlevel.test;

import java.io.File;

public class test1 {

    // line 7
    // crash error: unreported exception IOException; must be caught or declared to be thrown
    public static void main(String args[]) {
        String filename = "test.txt";
        File file = new File(filename);

        if(!file.exists()){
            file.createNewFile();
        }

        System.out.printf("Absolute path: %s\n", file.getAbsolutePath());
    }
}
