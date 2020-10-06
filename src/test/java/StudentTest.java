import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(123, "Corey", 0.0);

        //When
        boolean expected = true;
        boolean actual = student instanceof ILearner;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(123, "Corey", 0.0);

        //When
        boolean expected = true;
        boolean actual = student instanceof Person;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(123, "Corey", 0.0);
        student.learn(20.0);

        //When
        double expected = student.getTotalStudyTime();
        double actual = 20.0;
        double delta = 0.0;

        //Then
        Assert.assertEquals(expected, actual, delta);
    }
}
