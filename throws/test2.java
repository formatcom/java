package com.lowlevel.test;

import java.io.File;
import java.io.IOException;

public class test2 {

    public static void main(String args[]) throws IOException {
        String filename = "test.txt";
        File file = new File(filename);

        if(!file.exists()){
            file.createNewFile();
        }

        System.out.printf("Absolute path: %s\n", file.getAbsolutePath());
    }
}
