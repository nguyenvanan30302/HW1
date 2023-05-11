package ClassObject;

public class Student {
    private int age;
    private String name;
    public int id;

    public void showId (){
        System.out.println("sinh vien co id la :" +id);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
