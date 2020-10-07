import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentsSingletonTest {
    @Test
    public void getInstanceTest(){
        //Given
        Students.getInstance();

        //When
        String actual = Students.getInstance().findById(1L).getName();
        String expected = "Corey";

        //Then
        Assert.assertEquals(expected, actual);
    }
}
