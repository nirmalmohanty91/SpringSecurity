package com.example.demo.lambdaexpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

//        Runnable r =  () -> System.out.println("Nirmal");
//        r.run();

        String result = processFile((BufferedReader br) -> br.readLine() +"=>"+ br.readLine() );
        System.out.println(result);

    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data.txt"))){
            return p.process(br);
        }

    }
}
