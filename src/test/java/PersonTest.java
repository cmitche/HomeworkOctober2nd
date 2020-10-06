import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testConstructor(){
        //Given
        Person person = new Person(1234, "Corey");

        //When
        Long actualId  = person.getId();
        Long expectedId = Long.valueOf(1234);

        String actual = person.getName();
        String expected = "Corey";

        //Then
        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void setNameTest() {
        //Given
        Person person = new Person(1223, "Corey");
        person.setName("Super Negro");

        //When
        String actual = person.getName();
        String expected = "Super Negro";

        //Then
        Assert.assertEquals(actual, expected);
    }
}
