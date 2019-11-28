package nuigalway.app;
import java.util.ArrayList;

public class Student{
    String name;
    int age;
    String dob;
    int id;
    String username;
    String course;
    private ArrayList<Module> modules ;

    public Student(String name, int age, String dob, int id, String course, ArrayList<Module> modules){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.course = course;
        this.modules = modules;
        setUsername(name,age);
    }


    private void setUsername(String name, int age){
        username = name + Integer.toString(age);
    }

    public String getUsername() {
        return username;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    void addModule(Module m){
        modules.add(m);
    }

    String printModules(){
        if (modules != null){
            for(Module m :modules){
                return m.getName();
                //System.out.println(m.getName());
            }
        }else{
            System.out.println("empty");
        }
        return "";
    }

}

