import org.junit.Assert;
import org.junit.Test;



public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureTest1(){
        //ZipCodeObject
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        //Student object
        Student student = Students.getInstance().findById(1L);
        student.setTotalStudyTime(0.0);
        //Instructor object
        Instructor instructor = Educator.ALYSSA.getInstructor();
        //Invoke the hostLecture method
        zipCodeWilmington.hostLecture(instructor, 30.0);
        //
        double actual = Students.getInstance().findById(1L).getTotalStudyTime();//30
        Assert.assertEquals(actual, 10.0, 0.0);
    }
}
