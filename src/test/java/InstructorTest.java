import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InstructorTest {
    @Test
    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(123, "Susan");

        //When
        boolean actual = instructor instanceof ITeacher;
        boolean expected = true;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(123, "Susan");

        //When
        boolean actual = instructor instanceof Person;
        boolean expected = true;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(123, "Susan");
        Student student = new Student(132, "Gloria", 5.0);
        instructor.teach(student, 10.0);

        //When
        double actual = student.getTotalStudyTime();
        double expected = 15.0;
        double delta = 0.0;

        //Then
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(1, "Wakanda");
        Student student1 = new Student(2, "Earth", 5.0);
        Student student2 = new Student(3, "Wind", 10.0);
        Student student3 = new Student(4, "Fire", 20.0);
        Student student4 = new Student(5, "Water", 0.0);
        Student[] students = {student1, student2, student3, student4};

        //When
        instructor.lecture(students, 100.0);
        double expected = student1.getTotalStudyTime();//30
        double actual = 30;
        double delta = 0.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
}
