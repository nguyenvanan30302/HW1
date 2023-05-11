package ClassObject;

public class Main {
    public static void main(String[] args) {
        Student An = new Student();
       // An.name = "An";
        An.id = 3003;


      // System.out.println("Ten cua ban la " +An.name);
        An.setName("An bla");
        //An.showId();
        An.setAge(6);
        System.out.println(An.getName());
        System.out.println(An.getAge());

        Student Son = new Student();
        Son.setName("Son ngu");
        System.out.println("ten la " + Son.getName());
    }
}
