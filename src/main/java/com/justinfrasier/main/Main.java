package com.justinfrasier.main;

import static com.justinfrasier.JSON.JSON_Tools.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Killer Media Bot Starting......");
        if(!checkIfDirectoryExists()) {
            createDirectory();
            createFile();
        }

    }
}
