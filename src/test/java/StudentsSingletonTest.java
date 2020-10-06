import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentsSingletonTest {
    @Test
    public void getInstanceTest(){
        //Given
//      Students students = Students.getInstance();
        List<Person> cohort8 = new ArrayList<>();
        Students.getInstance();
        cohort8.add(new Person(1, "Corey"));
//        cohort8.add(new Person(2, "Darren"));
//        cohort8.add(new Person(3, "Asher"));
        People people = new People();
        Person person1 = new Person(1, "Corey");
        people.add(new Person(3, "Asher"));
//        List<Person> x = students.INSTANCE.getPersonList();
        //When
//        boolean expected = students.contains(new Person(1, "Corey"));
//        List<Person> actual = new ArrayList<>();
        List<Person> actual = people.getPersonList();
        List<Person> expected = Students.getInstance().getPersonList();


        //Then
        Assert.assertEquals(actual, expected);
    }
}
