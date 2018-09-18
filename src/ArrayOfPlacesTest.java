import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfPlacesTest {
  ArrayOfPlaces arrayOfPlaces;
    @Before
    public void setUp() throws Exception {
        arrayOfPlaces = new ArrayOfPlaces();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeVowelsFromPlaces() {
        //arrange
        String[] expected1= {"Ind","Untd Stts","Grmny"};
        String[] expected2= {};
        //act
        String[] result1= arrayOfPlaces.removeVowelsFromPlaces(new String[]{"India", "United States","Germany"},3);
        String[] result2= arrayOfPlaces.removeVowelsFromPlaces(new String[]{},0);
        //assert
        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
    }
}