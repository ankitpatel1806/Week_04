package junitproblem.basicproblem.filehandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

public class FileProcessorTest {

    FileProcessor fileProcessor = new FileProcessor();
    String filename = "testfile.txt";

    @BeforeEach
    public void setUp() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteToFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(filename, content);
        String fileContent = fileProcessor.readFromFile(filename);
        assertEquals(content, fileContent);
    }

    @Test
    public void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(filename, "Test Content");
        assertTrue(Files.exists(Paths.get(filename)));
    }

    @Test
    public void testIOExceptionWhenFileNotExist() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistentfile.txt"));
    }

    @AfterEach
    public void tearDown() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }
}
