import org.junit.Assert;
import org.junit.Test;



public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureTest1(){
        //ZipCodeObject
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Student student = Students.getInstance().findById(1L);
        Instructor instructor = Educator.ALYSSA.getInstructor();
        student.setTotalStudyTime(10.0);
        zipCodeWilmington.hostLecture(instructor, 30.0);
        double actual = Students.getInstance().findById(1L).getTotalStudyTime();//30
        Assert.assertTrue(actual == 20.0);
    }
}
