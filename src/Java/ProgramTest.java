package Java;

import org.junit.Assert;
import org.junit.Test;

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
        Throwable thrown = assertThrows(IOException.class, () -> {
            ReaderCSV.ReaderToCSV(filePath);
        });
        assertNotNull(thrown.getMessage());
    }

}