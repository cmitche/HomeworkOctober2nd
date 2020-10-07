import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleTest {
    List<Person> niggaList = new ArrayList<>();

    @Test
    public void addTest(){
        //Given
        Person person1 = new Person(001, "Earth");
        Person person2 = new Person(002, "Wind");
        Person person3 = new Person(003, "Fire");
        People people = new People();
        //When
        people.add(person1);
        people.add(person2);
        people.add(person3);
        //Then
        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void removeTest(){
        //Given
        People people = new People();
        Person person1 = new Person(001, "Earth");
        Person person2 = new Person(002, "Wind");
        Person person3 = new Person(003, "Fire");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        //When
        people.remove(person1);
        boolean actual = people.contains(person1);
        boolean expected = false;

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void findByIdTest(){
        //Given
        People people = new People();
        Person person1 = new Person(001, "Earth");
        Person person2 = new Person(002, "Wind");
        people.add(person1);
        people.add(person2);
        //When
        Person expected = person2;
        Person actual = people.findById(Long.valueOf(002));
        //Then
        Assert.assertEquals(expected, actual);
    }
}