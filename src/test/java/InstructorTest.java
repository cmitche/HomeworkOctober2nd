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
        Student student = new Student(132, "Gloria");
        instructor.teach(student, 10.0);

        //When
        double actual = student.getTotalStudyTime();
        double expected = 10.0;
        double delta = 0.0;

        //Then
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(1, "Wakanda");
        Student student1 = new Student(2, "Earth");
        Student student2 = new Student(3, "Wind");
        Student student3 = new Student(4, "Fire");
        Student student4 = new Student(5, "Water");
        Student[] students = {student1, student2, student3, student4};

        //When
        student1.setTotalStudyTime(5.0);
        instructor.lecture(students, 100.0);
        double expected = student1.getTotalStudyTime();//30
        double actual = 30;
        double delta = 0.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
}
