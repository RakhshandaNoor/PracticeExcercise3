import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks= new StudentMarks();
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void checkGrades() {
        //arrange
        String expected1=null;
        String expected2=" grade not in range 121";
        //act
        String actual1 = studentMarks.checkGrades(3, new int[]{15, 65,23});
        String actual2 = studentMarks.checkGrades(3, new int[]{15, 121,23});
        //assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);


    }
}