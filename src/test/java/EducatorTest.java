import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void testImplementation() {
        //Given
        Educator educator = Educator.ALYSSA;

        //Then
        Assert.assertTrue(educator instanceof ITeacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Educator educator = Educator.ALYSSA;

        //Then
        Assert.assertTrue(educator.getInstructor() instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
        Student student = new Student(132, "Gloria");
        student.setTotalStudyTime(10.0);
        Educator.PETER.teach(student, 10.0);

        //Then
        Assert.assertTrue(student.getTotalStudyTime() == 20.0);
    }

    @Test
    public void testLecture(){
        //Given
        Student student1 = new Student(1, "Earth");
        Student student2 = new Student(2, "Wind");
        Student student3 = new Student(3, "Fire");
        Student student4 = new Student(4, "Water");
        Student[] students = {student1, student2, student3, student4};
        Educator.TORRIE.lecture(students, 100);

        //Then
        Assert.assertTrue(student1.getTotalStudyTime() == 25);
    }
}