import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Consecutive7NumTest {
    Consecutive7Num consecutive7Num;

    @Before
    public void setUp() throws Exception {
        consecutive7Num = new Consecutive7Num();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkConsecutive() {
        //arrange
        boolean expected1= true;
        boolean expected2= false;
        //act
        boolean actual1= consecutive7Num.checkConsecutive(new int[]{65,64,63,62});
        boolean actual2= consecutive7Num.checkConsecutive(new int[]{68,69,68,67,66,65,64});

        //assert
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);

    }
}