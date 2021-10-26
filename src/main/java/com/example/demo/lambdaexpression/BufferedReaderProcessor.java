package com.example.demo.lambdaexpression;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader b) throws IOException;

    default void nirmal(){
        System.out.println("This is my name");
    }
}
