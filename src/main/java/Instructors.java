public class Instructors extends People<Instructor>{
    //1. Static instance
    static final Instructors INSTANCE = new Instructors();

    //2. Private constructor
    private Instructors(){
        this.add(new Instructor(1L, "Alyssa Bradley"));
        this.add(new Instructor(2L, "Torrie Borelli"));
        this.add(new Instructor(3L, "Peter X-Ray Vision Lonie"));
    }

    //3. Create a static method that returns the object.
    public static Instructors getInstance(){
        return INSTANCE;
    }
}
