import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students;
    Instructors instructors;

    //1. Static instance
    static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    //2. Private constructor
    private ZipCodeWilmington(){
    }

    //3. Create a static method that returns the object.
    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = instructors.getInstance().findById(id);
        instructor.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for(Student student : students.toArray()){
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
