package nuigalway.app;
import java.util.ArrayList;

public class Module {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String modname, ArrayList<Student> students, ArrayList<Course> courses){
        this.name = modname;
        this.students = students;
        this.courses = courses;
    }

    public String getName(){
        return name;
    }

    void addStudent(Student s){
        students.add(s);
    }

    public void addCourse(Course c){courses.add(c);}
}


