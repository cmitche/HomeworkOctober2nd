public class Instructors extends People<Instructor>{
    //1. Static instance
    static final Instructors INSTANCE = new Instructors();

    //2. Private constructor
    private Instructors(){
        this.add(Educator.ALYSSA.getInstructor());
        this.add(Educator.PETER.getInstructor());
        this.add(Educator.TORRIE.getInstructor());
    }

    //3. Create a static method that returns the object.
    public static Instructors getInstance(){
        return INSTANCE;
    }

    //4. Create a toArray method

}
