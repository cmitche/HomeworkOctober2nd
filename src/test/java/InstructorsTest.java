import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {
    @Test
    public void getInstanceTest(){
        //Given
        Instructors.getInstance();

        //When
        String actual = Instructors.getInstance().findById(1L).getName();
        String expected = "Alyssa Bradley";

        //Then
        Assert.assertEquals(expected, actual);
    }
}
