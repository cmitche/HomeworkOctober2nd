public class Students extends People{
    //1. Static instance
    static final Students INSTANCE = new Students();

    //2. Private constructor
    private Students(){
        INSTANCE.getPersonList().add(1, new Person(1, "Corey"));
        INSTANCE.getPersonList().add(2, new Person(2, "Darren"));
        INSTANCE.getPersonList().add(3, new Person(3, "Asher"));
//        INSTANCE.add(new Person(1, "Corey"));
//        INSTANCE.add(new Person(2, "Darren"));
//        INSTANCE.add(new Person(3, "Asher"));
////        INSTANCE.add(new Person(5, "Jadyn"));
////        INSTANCE.add(new Person(6, "Darren"));
////        INSTANCE.add(new Person(7, "Yasmin"));
////        INSTANCE.add(new Person(8, "Dallas"));
////        INSTANCE.add(new Person(9, "Asher"));
    }

    //3. Create a static method that returns the object.
    public static Students getInstance(){
        return INSTANCE;
    }
}
