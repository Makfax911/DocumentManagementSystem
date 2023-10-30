package main;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {

        String path = "src/test/resources";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();

        System.out.println(absolutePath);

        assertTrue(absolutePath.endsWith("src/test/resources"));
    }
}