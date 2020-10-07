public enum Educator implements ITeacher{
    ALYSSA(new Instructor(1L, "Alyssa Bradley")),
    TORRIE(new Instructor(2L, "Torrie Borelli")),
    PETER(new Instructor(3L, "Peter X-Ray Vision Lonie"));

    private final Instructor instructor;
    private double timeWorked;

    private Educator(Instructor instructor){
        this.instructor = instructor;
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public Instructor getInstructor(){
        return instructor;
    }
}
