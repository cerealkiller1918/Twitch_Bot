import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;
import static com.justinfrasier.JSON.JSON_Tools.*;

public class JSON_Tools_Test {

    @After
    public void cleanup(){//Cleans up the file and the directory after each test to that all the test runs clean.
        File file = new File(getFileName());
        if(file.exists()){
            file.delete();
        }
        Path path = Paths.get(getDirName());
        if(Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                System.out.println("Can not perform cleanup");
            }
        }
    }
    @Test
    public void checkDirectoryTest_False(){
        assertFalse(checkIfDirectoryExists());
    }

    @Test
    public void createDirectoryTest_True(){
        assertTrue(createDirectory());

    }

    @Test
    public void checkDirectoryTest_True(){
        createDirectory();
        assertTrue(checkIfDirectoryExists());
    }

    @Test
    public void createDirectoryTest_False(){
        createDirectory();
        assertFalse(createDirectory());
    }

    @Test
    public void checkIfFileExistTest_False(){
        assertFalse(checkIfFileExists());
    }

    @Test
    public void createFileTest_False(){
        assertFalse(createFile());
    }

    @Test
    public void createFileTest_True(){
        createDirectory();
        assertTrue(createFile());
    }

    @Test
    public void createDirAndFileTest_True(){
        assertTrue(createDirectoryAndFile());
    }

    @Test
    public void createDirAndFileTest_True2(){
        createDirectory();
        assertTrue(createDirectoryAndFile());
    }

    @Test
    public void createDirAndFileTest_False(){
        createDirectory();
        createFile();
        assertFalse(createDirectoryAndFile());
    }

}
