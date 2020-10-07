public class Students extends People<Student>{
    //1. Static instance
    static final Students INSTANCE = new Students();

    //2. Private constructor
    private Students(){
        this.add(new Student(1L, "Corey"));
        this.add(new Student(2L, "Darren"));
        this.add(new Student(3L, "Asher"));
    }

    //3. Create a static method that returns the object.
    public static Students getInstance(){
        return INSTANCE;
    }

    //4. Create a toArray method that returns a Student array.
    public Student[] toArray(){
        Student[] students = new Student[getPersonList().size()];
        for(int index = 0; index < getPersonList().size(); index++){
            students[index] = getPersonList().get(index);
        }
        return students;
    }
}
