import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureTest(){
        //Given
//        long id = 1L;
//        double numberOfHours = 30;
        ZipCodeWilmington.getInstance().hostLecture(1L, 30.0);
        Student student = (Student) Students.getInstance().findById(1L);
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        zipCodeWilmington.getStudyMap();
//        Map<> mapOfStudents = new HashMap();
//        mapOfStudents.put();
        double actual = student.getTotalStudyTime();//25.0 + 10.0 = 35.0
        double expected = 35.0;

        //When

        //Then
        Assert.assertEquals(actual, expected);
    }
}
