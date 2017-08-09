package com.justinfrasier.JSON;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSON_Tools {
    public static String getDirName() {
        return dirName;
    }

    public static String getFileName() {
        return fileName;
    }

    private static String dirName = "Twitch_Bot";
    private static String fileName = dirName+"\\userData.json";

    public static boolean checkIfDirectoryExists(){
        Path path = Paths.get(getDirName());
        if(Files.exists(path)) return true;
        else return false;
    }
    public static boolean createDirectory(){
        try{
            Path path = Paths.get(getDirName());
            if(!Files.exists(path)){
                Files.createDirectory(path);
                return true;
            }else return false;
        }catch (IOException e){
            return false;
        }
    }

    public static boolean checkIfFileExists(){
        File file = new File(getFileName());
        if(file.exists()) return true;
        else return false;
    }

    public static boolean createFile(){
        File file = new File(getFileName());
        if (!file.exists()) {
            try {
                file.createNewFile();
                return true;
            } catch (IOException e) {
                return false;
            }
        }else return false;
    }

    public static boolean createDirectoryAndFile(){
        if(createDirectory()&&createFile()) return true;
        else if (createFile()) return true;
        else return false;
    }
}
