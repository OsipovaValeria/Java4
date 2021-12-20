package Java;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void testToStringHuman() {
        Division division = new Division("I");
        Human human = new Human(28281, "Aahan", "Male", "15.05.1970", division, 4800);
        String actual = human.toString();
        String expected = "\nID = 28281 | Name = Aahan | Gender = Male | BirthDate = 15.05.1970 | DivisionName = I | DivisionID = 9 | Salary = 4800";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToStringDivision() {
        Division division = new Division("A");
        String actual = division.toString();
        String expected = " | DivisionName = A | DivisionID = 1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPathFile() {
        String filePath = "C:\\Users\\DNS\\Desktop\\foreign.csv";
        IOException exception = assertThrows(IOException.class, () -> {
            ReaderCSV.ReaderToCSV(filePath);
        });
        Assertions.assertEquals("C:\\Users\\DNS\\Desktop\\foreign.csv (Не удается найти указанный файл)", exception.getMessage());
    }

    @Test
    public void testFileEmpty() {
        String filePath = "C:\\Users\\DNS\\Desktop\\foreign_names1.csv";
        Exception exception = assertThrows(Exception.class, () -> {
            ReaderCSV.ReaderToCSV(filePath);
        });
        Assertions.assertEquals("Файл пуст!", exception.getMessage());
    }

    @Test
    public void testFileData() {
        String filePath = "C:\\Users\\DNS\\Desktop\\foreign_names2.csv";
        Exception exception = assertThrows(Exception.class, () -> {
            ReaderCSV.ReaderToCSV(filePath);
        });
        Assertions.assertEquals("Данные некорректны!", exception.getMessage());
    }

}