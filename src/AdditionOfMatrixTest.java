import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest {
  AdditionOfMatrix additionOfMatrix;
    @Before
    public void setUp() throws Exception {
        additionOfMatrix = new AdditionOfMatrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculateSum() {
        int[][] expected1 = {{5,5},{5,5}};
        int[][] expected2 = {{},{}};

        int[][] result1 = additionOfMatrix.calculateSum(2,2,new int[][]{{1,2},{3,4}},new int[][]{{4,3},{2,1}});
        int[][] result2 = additionOfMatrix.calculateSum(0,0, null, null);
    }
}