import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void lavSuperhelt() {
        // Arrange
        Database database = new Database();

        // Act
        database.lavSuperhelt("Superman","Stærk","Clark Kent","ja",1920,15);
        ArrayList<Superhelt> results = database.getSuperhelte();

        // Assert
        int expectedSize = 1;
        int actualSize = results.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void sletSuperhelt() {
        // Arrange
        Database database = new Database();
        // Act
        database.lavSuperhelt("Superman","Stærk","Clark Kent","ja",1920,15);
        ArrayList<Superhelt> results = database.getSuperhelte();
        results.remove(0);

        // Assert
        int expectedSize = 0;
        int actualSize = results.size();

    }

    /*@Test
    void deleteSuperhero() {
        Database database = new Database();
        database.lavSuperhelt("Superman","Stærk","Clark Kent","ja",1920,15);

        ArrayList<Superhelt> results = database.getSuperhelte();
        Superhelt superhelt = results.get(0);
        boolean actualResult = database.sletSuperhelt(superhelt);
        boolean expectedResult = true;

        assertEquals(actualResult, expectedResult);

        int expectedSize = results.size() - 1;
        ArrayList<Superhelt> resultsAfterDelete = database.getSuperhelte();
        int actualSize = resultsAfterDeletes.size();
        assertEquals(expectedSize, actualSize);
    }*/

    /*@Test
    void søgEfterEnSuperhelt() {
        // Arrange
        Database database = new Database();
        // Act
        List<Superhelt> results = database.søgEfterSuperhelt("Batman");
        // Assert
        int actualSize = results.size();
        int expectedSize = 1;

        assertEquals(actualSize, expectedSize);


    }*/



}