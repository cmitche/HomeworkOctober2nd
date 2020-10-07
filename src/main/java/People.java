import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class People<E extends Person> implements Iterable<E> {
    List<E> personList =new ArrayList<E>();
    public void add(E person) {
        personList.add(person);
    }
    public E findById(long id) {
        for (E person: personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean contains(E person) {
        return (personList.contains(person));
    }
    public void remove(E person) {
        if (contains(person)) {
            personList.remove(person);
        }
    }
    public void remove(long id) {
        personList.removeIf(person -> person.getId() == id);
    }
    public void removeAll() {
        personList.clear();
    }
    public int count() {
        return personList.size();
    }
    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}






